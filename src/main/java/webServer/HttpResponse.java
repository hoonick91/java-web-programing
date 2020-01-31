package webServer;

public class HttpResponse {

    private byte[] body;

    public HttpResponse(HttpRequest httpRequest) {

    }

    public void setBody(byte[] body) {
        this.body = body;
    }
}
