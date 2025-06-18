import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final int port = 3000;

    public Server() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    
                }
            }

        } catch (IOException e) {
            System.err.println("Could not start server: " + e.getMessage());
        }
    }
}