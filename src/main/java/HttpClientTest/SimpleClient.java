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
        //Get方法请求
        HttpMethod httpMethod = new GetMethod("http://www.baidu.com");
        httpClient.executeMethod(httpMethod);
        //打印抓取状态
        System.out.println(httpMethod.getStatusLine());
        //打印抓取内容
        System.out.println(httpMethod.getResponseBodyAsString());
        //释放链接
        httpMethod.releaseConnection();
    }
}
