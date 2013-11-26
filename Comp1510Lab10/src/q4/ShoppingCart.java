package q4;

import java.text.NumberFormat;

/**
 * A class representing a shopping cart
 * @author George
 *
 */
public class ShoppingCart {
    private int itemCount;
    private double totalPrice;
    private int capacity;
    private Item[] cart;

    /**
     * A constructor to create an empty shopping cart with capacity of 5
     */
    public ShoppingCart(){
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    /**
     * Add item to cart
     * @param itemName
     * @param price
     * @param quantity
     */
    public void addToCart(String itemName, double price, int quantity){
        int tempLength = cart.length;
        int tempTotal = 0;
        if (itemCount == cart.length){
            increaseSize();
        }
        cart[itemCount] = new Item(itemName, price, quantity);
        totalPrice += price;
        itemCount++;

    }

    /**
     * Output item of a cart
     */
    @Override
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping cart\n";
        contents+= "\nItem\t\tUnit Price\tQuantity\tTotal\n";

        for (int i=0; i<itemCount; i++){
            contents += cart[i].toString() + "\n";
        }

        contents += "\nTotalPrice: " + fmt.format(totalPrice);
        contents += "\n";

        return contents;
    }

    /**
     * Increase cart size by 3 elements
     */
    private void increaseSize(){
        Item[] temp = new Item[cart.length+3];

        for (int i=0; i<cart.length; i++){
            temp[i] = cart[i];
        }

        cart = temp;
    }
}
