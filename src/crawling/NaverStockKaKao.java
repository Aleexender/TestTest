package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NaverStockKaKao {
    public static void main(String[] args) {

        String URL = "https://finance.naver.com/item/main.naver?code=035720";
        Document doc;

        try {
            doc = Jsoup.connect(URL).get();
            Elements element = doc.select(".date");

            Elements totalPrice = doc.getElementsByAttributeValue("class","no_today").get(0).getElementsByAttributeValue("class","blind");
            String price = totalPrice.text();

            Elements highestPrice = doc.getElementsByAttributeValue("class", "no_up").get(0).getElementsByAttributeValue("class","blind");
            String highPrice = highestPrice.text();

            Elements lowestPrice = doc.getElementsByAttributeValue("class", "no_down").get(0).getElementsByAttributeValue("class","blind");
            String lowPrice = lowestPrice.text();


            System.out.println(price);
            System.out.println(highPrice);
            System.out.println(lowPrice);


