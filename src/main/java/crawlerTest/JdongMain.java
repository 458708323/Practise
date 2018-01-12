package crawlerTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.util.List;


/**
 * @author wb-zh306310
 * @create 2018/1/10 9:36
 */
public class JdongMain {
    static final Log logger = LogFactory.getLog(JdongMain.class);

    public static void main(String[] args) throws Exception {
        //��ʼ��һ��httpClient
        HttpClient client = new CloseableHttpClient() {
            @Override
            protected CloseableHttpResponse doExecute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException, ClientProtocolException {
                return null;
            }

            public void close() throws IOException {

            }

            public HttpParams getParams() {
                return null;
            }

            public ClientConnectionManager getConnectionManager() {
                return null;
            }
        };
        //��ַ  ����ȡһ��URL����
        String url = "http://search.jd.com/Search?keyword=Python&enc=utf-8&book=y&wq=Python&pvid=33xo9lni.p4a1qb";
        //ץȡ������
        List<JdModel> bookdatas = URLFecter.URLParser(client, url);
        //ѭ�����ץȡ
        for (JdModel jd : bookdatas) {
            System.out.println("bookID:"+jd.getBookId()+"\t"+"bookPrice:"+jd.getBookPrice()+"\t"+"bookName:"+jd.getBookName());
        }

        //�������ݿ�
//        MYSQLControl.excuteInsert(bookdatas);
    }
}
