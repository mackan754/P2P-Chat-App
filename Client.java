public class Client {
    private String ip;
    private String port;
    private boolean connectionStatus;

    public Client() {
        this.connectionStatus = false;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(String port) {
        this.port = port;
    }
}