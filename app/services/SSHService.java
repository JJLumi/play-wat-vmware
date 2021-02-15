package services;

import models.VMConnection;
import models.VMInfo;
import models.VMPowerState;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.common.IOUtils;
import net.schmizz.sshj.connection.channel.direct.Session;
import net.schmizz.sshj.connection.channel.direct.Session.Command;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SSHService {
    private VMConnection connection;
    private static final Console con = System.console();

    public SSHService(VMConnection connection) {
        this.connection = connection;
    }

    /**
     * dodaj sobie konkretne implementacje do komend które chcesz na hoscie wykonywać,
     * tu masz generyczny przykład jak odpalic jakąkolwiek komende i otrzymać wynik jako String
     *
     * @throws IOException
     */
    public String executeCommand(String command) throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String res = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec(command);
            res = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());
            return res;
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (IOException e) {
                // Do Nothing
            }
            ssh.disconnect();
        }
    }
    public List<VMInfo> listVms() throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String res = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec("vim-cmd vmsvc/getallvms |  awk '{print $1, $2}'");
            res = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            System.out.println(res);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());
            return stringToVmList(res);
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (IOException e) {
                // Do Nothing
            }
            ssh.disconnect();
        }
    }

    private List<VMInfo> stringToVmList(String res) {
        String[] arr = res.split("\n");
        System.out.println(arr[0]);
       List<VMInfo> result = new ArrayList<VMInfo>();
        for (int i = 1; i < arr.length; i++) {
            // accessing each element of array
            String line = arr[i];
            System.out.println(line);
            String[] vmarray = line.split("\\s+");
            System.out.println(Arrays.toString(vmarray));
            result.add(new VMInfo(vmarray[1],vmarray[0]));
        }
        return result;

    }
 /*
    public VMPowerState powerCheck (String vmid) throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String pow = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec("vim-cmd vmsvc/power.getstate " +vmid); //tutaj przekazać VMid
            res = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            System.out.println(pow);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());
            return stringToVmList(pow);
        }
    }
*/
}
