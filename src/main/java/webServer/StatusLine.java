package webServer;

import com.github.jknack.handlebars.internal.lang3.StringUtils;

public class StatusLine {

    private String url;

    public StatusLine() {
    }

    public StatusLine(String statusList) {
        String[] statusLineFields = StringUtils.split(statusList, " ");
        this.url = statusLineFields[1];
    }

    public String getUrl() {
        return url;
    }
}
