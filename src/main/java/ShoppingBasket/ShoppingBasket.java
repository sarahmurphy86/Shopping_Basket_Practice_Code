package ShoppingBasket;

import Items.Item;

import java.util.ArrayList;

public class ShoppingBasket {
    protected ArrayList<Item> items;

    public ShoppingBasket(){
        this.items = new ArrayList<>();
    }

    public int getAmountOfItems(){
        return this.items.size();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void emptyAllItems() {
        this.items.clear();
    }


    public double totalCostOfItems() {
        double total = 0;

        for (Item item : this.items){
            total += item.getSellingPrice();
        }
            return total;
    }
}
