package webServer;

public interface HttpRequestHandler {
    boolean canHandle(String path);

    void handle(HttpRequest httpRequest, HttpResponse httpResponse);
}
