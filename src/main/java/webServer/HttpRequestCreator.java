package webServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HttpRequestCreator {
    public static HttpRequest create(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StatusLine statusLine = new StatusLine(bufferedReader.readLine());
        System.out.println("HttpRequest 생성");
        return new HttpRequest(statusLine);
    }
}
