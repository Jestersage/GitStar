package q4;

import java.text.NumberFormat;

/**
 * A class representing the items of a store
 * @author George
 *
 */
public class Item {
    private String name;
    private double price;
    private int quantity;

    /**
     * Constructor
     * @param itemName
     * @param itemPrice
     * @param numPurchased
     */
    public Item(String itemName, double itemPrice, int numPurchased){
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    @Override
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name +"\t\t" + fmt.format(price) + "\t" + quantity +"\t\t"
                + fmt.format(price*quantity));
    }

    /**
     * return price of the item
     * @return
     */
    public double getPrice(){
        return price;
    }

    /**
     * return name of the item
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * return the amount of the item
     * @return
     */
    public int getQuantity(){
        return quantity;
    }
}
