package webServer;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        try (ServerSocket serverSocket = new ServerSocket(8080)) {

            Socket connection;
            int i = 0;
            while ((connection = serverSocket.accept()) != null) {

                executorService.execute(new RequestHandler(connection));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();


    }
}
