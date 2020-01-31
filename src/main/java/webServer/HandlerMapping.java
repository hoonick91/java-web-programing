package webServer;

import java.util.Arrays;
import java.util.List;

public class HandlerMapping {

    private static final List<HttpRequestHandler> HANDLERS = Arrays.asList(
            HttpServletRequestHandler.getInstance(),
            new HttpResourceRequestHandler(StaticFileLoader.getInstance())
    );

    //TODO Singleton으로 구현??
    public static HandlerMapping getInstance() {
        return new HandlerMapping();
    }

    public HttpRequestHandler getHandler(String path) {
        return HANDLERS.stream()
                .filter(httpRequestHandler -> httpRequestHandler.canHandle(path))
                .findAny()
                .orElseThrow(RuntimeException::new);
    }
}
