package webServer;

public abstract class AbstractHttpRequestHandler implements HttpRequestHandler {

    @Override
    public void handle(HttpRequest httpRequest, HttpResponse httpResponse) {
        //TODO 공통 처리
        checkHttpVersion(httpRequest);
        handleInternal(httpRequest, httpResponse);
    }

    private void checkHttpVersion(HttpRequest httpRequest) {
        System.out.println("AbstractHttpRequestHandler checkHttpVersion");
    }

    public void handleInternal(HttpRequest httpRequest, HttpResponse httpResponse) {
        System.out.println("AbstractHttpRequestHandler handleInternal");
    }

}
