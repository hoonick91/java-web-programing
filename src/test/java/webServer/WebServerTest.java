package webServer;

import org.junit.Test;

import java.net.Socket;

public class WebServerTest {



    @Test
    public void main() {
        WebServer webServer = new WebServer();
        webServer.main();

        try {
            Socket socket = new Socket("localhost", 8000);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}