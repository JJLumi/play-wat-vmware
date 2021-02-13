package controllers;

import com.typesafe.config.Config;
import models.VMConnection;
import models.VMInfo;
import models.VMPowerState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.SSHService;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

import static play.libs.Scala.asScala;

@Singleton
public class VMServerController extends Controller {
    private MessagesApi messagesApi;
    private final Config config;
    private final Form<ConnectionData> form;
    private VMConnection vmConnection;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    public VMServerController(FormFactory formFactory, MessagesApi messagesApi, Config config) {
        this.form = formFactory.form(ConnectionData.class);
        this.messagesApi = messagesApi;
        this.config = config;
    }

    public Result setCredentials(Http.Request request) {
        final Form<ConnectionData> boundForm = form.bindFromRequest(request);
        if (boundForm.hasErrors()) {
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.index.render(boundForm, request, messagesApi.preferred(request)));
        } else {
            ConnectionData data = boundForm.get();
            System.out.println("data: " + data);
            this.vmConnection = new VMConnection(data.getServer(), Integer.parseInt(data.getPort()), data.getUsername(), data.getPassword());
            return redirect(routes.VMServerController.listVMs())
                    .flashing("info", "Connection data received");
        }
    }


    public Result listVMs() {
        List<VMInfo> infos = new ArrayList<>();
        try {
            System.out.println("server: " + vmConnection.getServer());
            System.out.println("username: " + vmConnection.getUsername());
           SSHService ssh = new SSHService(vmConnection);
            infos = ssh.listVms();
        } catch (Exception ex) {
            logger.error("ERROR: " + ex.getMessage());
            return ok(views.html.vmlist.render(asScala(infos)));
        } finally {
            return ok(views.html.vmlist.render(asScala(infos)));
        }
    }


    public Result stopVM(String vmId) { //vmID
        System.out.println("STOP: " + vmId);
        System.out.println("VM Conn: " + vmConnection);
        try {

        }
        finally {
            return redirect(routes.VMServerController.listVMs());
        }
    }

    public Result startVM(String vmId) {
        System.out.println("START: " + vmId);
        System.out.println("VM Conn: " + vmConnection);
        try {
            //execute command to start vm, get the output and parse it
        } finally {
            return redirect(routes.VMServerController.listVMs());
        }
    }

    public Result suspendVM(String vmName) {
        System.out.println("SUSPEND: " + vmName);
        System.out.println("VM Conn: " + vmConnection);
        try {
            //execute command to suspend vm, get the output and parse it
        } finally {
            return redirect(routes.VMServerController.listVMs());
        }
    }

    public Result resetVM(String vmName) {
        System.out.println("RESET: " + vmName);
        System.out.println("VM Conn: " + vmConnection);
        try {
            //execute command to reset vm, get the output and parse it
        } finally {
            return redirect(routes.VMServerController.listVMs());
        }
    }

}

