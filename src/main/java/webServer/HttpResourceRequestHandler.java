package webServer;

import com.github.jknack.handlebars.internal.lang3.StringUtils;
import com.github.jknack.handlebars.io.TemplateLoader;

public class HttpResourceRequestHandler extends AbstractHttpRequestHandler {


    public HttpResourceRequestHandler(TemplateLoader fileLoader) {
        //TODO fileLoader 설정
    }

    @Override
    public void handleInternal(HttpRequest httpRequest, HttpResponse httpResponse) {
        checkRequestMethod();
        System.out.println("HttpResourceRequestHandler handleInternal");
    }

    private void checkRequestMethod() {
        System.out.println("Http method check");
    }

    @Override
    public boolean canHandle(String path) {
        String[] url = StringUtils.split(path, "/");
        return url[url.length - 1].equals("index.html");
    }
}
