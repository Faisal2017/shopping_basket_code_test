package shopping_basket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Shop {

    private ArrayList<Sellable> basket;
    private boolean cutomerLoyaltyCard;

    public Shop() {
        this.basket = new ArrayList<Sellable>();
    }


    public int buyOneGetOneFree(Basket basket) {

        int counter = 0;

        for (Sellable item : this.basket) {
            if (item.equals("cereal")) {
                counter ++ ;
            }
        }
        if (counter > 1) {
            return basket.itemValues() / 2 ;
        }
        else return basket.itemValues();
    }

    public int percentageDiscount(Basket basket) {
        int multiplier = 90 / 100;


        if (basket.itemValues() > 20) {
            return basket.itemValues() * multiplier;
        }
        else return basket.itemValues();
    }



}
