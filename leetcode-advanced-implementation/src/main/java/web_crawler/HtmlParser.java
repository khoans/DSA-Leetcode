package web_crawler;

import java.util.List;

public interface HtmlParser {
    public List<String> getUrls(String url);
}
