package crawlNews;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/");
            Scanner scanner =new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+","");
            content = content.replaceAll("\\r+", "");
            content.trim();

//            Pattern p = Pattern.compile("<h3 class=\"news-item__title\"><a(.*?)");
            Pattern p = Pattern.compile("title=\"[a-zA-z0-9,.](.*?)");
            Matcher m = p.matcher(content);
            while (m.find()){
                String test = m.group(1);
                System.out.println(m.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
