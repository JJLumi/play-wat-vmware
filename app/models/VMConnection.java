package models;

public class VMConnection {
    private String server;
    private String username;
    private String password;
    private int port;

    public VMConnection(String server, int port, String username, String password) {
        this.server = server;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public String getServer() {
        return server;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "VMConnection{" +
                "server='" + server + '\'' +
                ", username='" + username + '\'' +
                ", port='" + port + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
