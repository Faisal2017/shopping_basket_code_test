package shopping_basket;

import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Sellable> basket;

    public ShoppingBasket() {
        this.basket = new ArrayList<Sellable>();
    }


    public int getItems() {
        return basket.size();
    }

    public void addItems(Sellable item) {
        basket.add(item);
    }

    public void removeItem(Sellable item) {
        basket.remove(item);
    }
}
