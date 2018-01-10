package crawlerTest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wb-zh306310
 * @create 2018/1/10 10:03
 */
public class URLFecter {
    public static List<JdModel> URLParser(HttpClient client, String url) throws Exception {
        //���ս�������
        List<JdModel> JingdongData = new ArrayList<JdModel>();
        //��ȡ��վ��Ӧ��html
        HttpResponse response = HTTPUtils.getRawHtml(client, url);
        //��ȡ��Ӧ״̬��
        int StatusCode = response.getStatusLine().getStatusCode();
        //200 ��ȡʵ�����ݻ�json�ļ�  ��������ʵ��
        if (StatusCode == 200) {
            String entity = EntityUtils.toString(response.getEntity(), "UTF-8");
            JingdongData = JdParse.getData(entity);
            EntityUtils.consume(response.getEntity());
        } else {
            EntityUtils.consume(response.getEntity());
        }

        return JingdongData;
    }
}
