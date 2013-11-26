package q3;


import java.util.Scanner;

/**
 * Take in the size of an array, fill it up, and reverse an array; output it
 * @author George
 *
 */
public class ReverseArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] intArray;
        int arraySize;
        int temp;

        //Prompt and take in the size of the array
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a size of the array: ");
        arraySize = scan.nextInt();

        //create array
        intArray = new int[arraySize];

        //Fiull up the array
        for(int i=0; i<intArray.length; i++){
            System.out.print("Please enter an integer for the cell " + i + " : " );
            intArray[i] = scan.nextInt();
        }

        //Output original value for debug purpose
        System.out.println("Original Array: ");
        for(int i=0; i<intArray.length; i++){
            System.out.print(intArray[i]+ " ");
        }

        int j = intArray.length-1;
        //swapping: put 1st value in temp, put last value in 1st,
        //put temp in last. Go to half of the array
        for (int i=0; i<intArray.length/2; i++){
                temp = intArray[i];
                intArray[i]= intArray[j];
                intArray[j] = temp;
                j--;
        }

        //Output new array
        System.out.println("New Array: ");
        for(int i=0; i<intArray.length; i++){
            System.out.print(intArray[i]+ " ");
        }



    }

}
