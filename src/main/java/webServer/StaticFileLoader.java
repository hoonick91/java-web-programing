package webServer;

import com.github.jknack.handlebars.io.ClassPathTemplateLoader;

public class StaticFileLoader extends ClassPathTemplateLoader {
    public StaticFileLoader(String prefix, String suffix) {
        super(prefix, suffix);
    }

    public StaticFileLoader(String prefix) {
        super(prefix);
    }

    public StaticFileLoader() {
    }

    public static StaticFileLoader getInstance() {
        return new StaticFileLoader("/static", "");
    }
}
