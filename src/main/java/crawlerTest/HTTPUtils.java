package crawlerTest;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicHttpResponse;

import java.io.IOException;

/**
 * @author wb-zh306310
 * @create 2018/1/10 10:14
 */
public class HTTPUtils {
    public static HttpResponse getRawHtml(HttpClient client, String personalUrl) {
        //��ȡ��Ӧ�ļ�����html������get������ȡ��Ӧ����
        HttpGet getMethod = new HttpGet(personalUrl);
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");
        try {
            //ִ��get����
            response = client.execute(getMethod);
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            // getMethod.abort();
        }
        return response;
    }
}
