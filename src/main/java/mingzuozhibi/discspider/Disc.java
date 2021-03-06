package mingzuozhibi.discspider;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Disc {

    private String asin;
    private String type;
    private String date;
    private String title;
    private Integer rank;
    private Integer price;
    private boolean buyset;
    private boolean outOfStock;
    private boolean offTheShelf;

}
