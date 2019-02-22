```java

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

public class Controller {
    @FXML
    void searchTitle(ActionEvent event) {
   
        try {
            Document doc =Jsoup.connect("https://www.google.com/search?q=java&rlz=1C1AVFC_esES814ES814&oq=java&aqs=chrome.0.0j69i60l3j69i59l2.374j0j7&sourceid=chrome&ie=UTF-8").get();
            String title = doc.title();

            Elements headline=doc.select("h3.LC20lb");



            for(Element hl : headline){
                lbl.setText(h1.text());
                System.out.println(hl.text());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



´´´
