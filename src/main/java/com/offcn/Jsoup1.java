package com.offcn;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Jsoup1 {

	public static void main(String[] args) throws IOException {
		Document document = Jsoup.connect("http://www.ujiuye.com").get();
		Elements elements = document.getElementsByClass("itxx_nr zghdc2 clearfix").next();
		for (Element element2 : elements) {
			Elements elementsByTag = element2.getElementsByTag("li");
			for (Element element3 : elementsByTag) {
				Element element4 = element3.getElementsByTag("span").first();
				System.out.println(element4.text());
			}
		}	
	}
}
