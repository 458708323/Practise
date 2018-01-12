package HttpClientTest;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

/**
 * @author wb-zh306310
 * @create 2018/1/11 9:46
 */
public class SimpleClient {
    public static void main(String[] args) throws IOException {
        HttpClient httpClient = new HttpClient();
        //Get��������
        HttpMethod httpMethod = new GetMethod("http://www.baidu.com");
        httpClient.executeMethod(httpMethod);
        //��ӡץȡ״̬
        System.out.println(httpMethod.getStatusLine());
        //��ӡץȡ����
        System.out.println(httpMethod.getResponseBodyAsString());
        //�ͷ�����
        httpMethod.releaseConnection();
    }
}
