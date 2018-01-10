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
        //接收解析数据
        List<JdModel> JingdongData = new ArrayList<JdModel>();
        //获取网站响应的html
        HttpResponse response = HTTPUtils.getRawHtml(client, url);
        //获取响应状态码
        int StatusCode = response.getStatusLine().getStatusCode();
        //200 获取实体内容或json文件  否则消耗实体
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
