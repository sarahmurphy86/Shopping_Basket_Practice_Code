package Items;

public abstract class Item {
    protected double sellingPrice;

    public Item(double sellingPrice){
        this.sellingPrice = sellingPrice;
    }


    public double getSellingPrice() {
        return this.sellingPrice;
    }
}

