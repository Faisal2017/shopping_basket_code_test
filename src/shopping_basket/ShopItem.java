package shopping_basket;

public abstract class ShopItem {

    private int buyingPrice;
    private int sellingPrice;

    public ShopItem(int buyingPrice, int sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

}
