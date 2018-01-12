package crawlerTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wb-zh306310
 * @create 2018/1/10 10:16
 */
public class JdParse {
    public static List<JdModel> getData (String html) throws Exception{
        //��ȡ�����ݣ�����ڼ�����
        List<JdModel> data = new ArrayList<JdModel>();
        //����Jsoup����
        Document doc = Jsoup.parse(html);
        //��ȡhtml��ǩ�е�����
        Elements elements=doc.select("ul[class=gl-warp clearfix]").select("li[class=gl-item]");
        for (Element ele:elements) {
            String bookID=ele.attr("data-sku");
            String bookPrice=ele.select("div[class=p-price]").select("strong").select("i").text();
            String bookName=ele.select("div[class=p-name]").select("em").text();
            //����һ������������Կ�����ʹ��Model�����ƣ�ֱ�ӽ��з�װ
            JdModel jdModel=new JdModel();
            //�����ֵ
            jdModel.setBookId(bookID);
            jdModel.setBookName(bookName);
            jdModel.setBookPrice(bookPrice);
            //��ÿһ�������ֵ�����浽List������
            data.add(jdModel);
        }
        //��������
        return data;
    }
}