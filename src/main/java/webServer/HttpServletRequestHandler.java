package webServer;

import java.util.HashMap;
import java.util.Map;

public class HttpServletRequestHandler extends AbstractHttpRequestHandler {

    private static final Map<String, Controller> HANDLERS = new HashMap<>();

    static {
        HANDLERS.put("/user", UserController.getInstance());
    }

    @Override
    public void handleInternal(HttpRequest httpRequest, HttpResponse httpResponse) {
        System.out.println("HttpServletRequestHandler handleInternal");
    }

    public static HttpServletRequestHandler getInstance() {
        return new HttpServletRequestHandler();
    }

    @Override
    public boolean canHandle(String path) {
        return HANDLERS.containsKey(path);
    }

}
