public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Server server = new Server();
        GUI GUI = new GUI(client, server);
    }
}
