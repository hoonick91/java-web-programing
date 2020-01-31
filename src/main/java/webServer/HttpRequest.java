package webServer;

public class HttpRequest {

    StatusLine statusLine;

    public HttpRequest(StatusLine statusLine) {
        this.statusLine = statusLine;
    }

    public String getUrl() {
        return statusLine.getUrl();
    }
}
