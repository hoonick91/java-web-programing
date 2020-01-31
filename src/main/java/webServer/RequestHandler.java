package webServer;


import java.io.InputStream;
import java.net.Socket;

public class RequestHandler implements Runnable {
    private Socket socket;
    private final HandlerMapping handlerMapping = HandlerMapping.getInstance();

    public RequestHandler(Socket socket) {
        System.out.println("생성");
        this.socket = socket;
    }

    @Override
    public void run() {
        try (InputStream inputStream = socket.getInputStream()) {
            //TODO httpRequest 정보 저장(header, body...)
            //생성과 사용의 분리를 위해 Creator 생성
            HttpRequest httpRequest = HttpRequestCreator.create(inputStream);
            HttpResponse httpResponse = new HttpResponse(httpRequest);
            HttpRequestHandler handler = handlerMapping.getHandler(httpRequest.getUrl());
            handler.handle(httpRequest, httpResponse);

            socket.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
//        socket.getInputStream();
    }
}
