package q4;

import java.util.Scanner;

/**
 * Mimic the epxerience of a check out
 * @author George
 *
 */
public class Shopping {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ShoppingCart cart = new ShoppingCart();
        boolean shopping = true;
        int index=0;
        int tempQuantity;
        double tempPrice;
        String tempName;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Please enter an item's name");
            tempName=scan.next();
            System.out.println("Please enter an item's price");
            tempPrice=scan.nextDouble();
            System.out.println("Please enter an item's quantity");
            tempQuantity=scan.nextInt();
            cart.addToCart(tempName, tempPrice,tempQuantity);

            System.out.println("Keep shopping? ");
            String tempInput = scan.next();

            if(tempInput.equalsIgnoreCase("Y")){
                shopping = true;
            }
            else{
                shopping = false;
            }

        }while(shopping);

        System.out.println(cart);

    }

}
