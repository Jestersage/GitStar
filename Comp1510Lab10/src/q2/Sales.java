package q2;


import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int salesPeople;
        int[] sales;
        int salesId;
        int sum;
        int maxSalesId=0;
        int minSalesId=0;
        double average;
        int quota;
        int quotaMeeters=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("enter the amount of salespeople: ");
        salesPeople = scan.nextInt();
        sales = new int[salesPeople];

        for (int i=0; i<sales.length; i++){
            System.out.print("Enter sales for salesperson " + (i+1)  + ": ");
            sales[i] = scan.nextInt();
            if (sales[i]>=sales[maxSalesId]){
                maxSalesId = i;
            }
            if (sales[i]<=sales[minSalesId]){
                minSalesId = i;
            }

        }
        System.out.println("\nSalesperson\tSales");
        System.out.println("------------------------");
        sum=0;

        for (int i =0 ; i<sales.length; i++){
            salesId=i;
            System.out.println("\t"  + (i+1) + "\t" +sales[salesId]);
            sum += sales[i];
        }

        System.out.println("\nTotal Sales: " + sum);

        //calculate the average sales
        average = sum / (double) salesPeople;
        System.out.println("Average sales: " + average);

        //print out he max sales
        System.out.println("Salesperson " + (maxSalesId+1) + " have the most"
                + "sales with " + sales[maxSalesId]);
        //print out min sales
        System.out.println("Salesperson " + (minSalesId+1) + " have the least"
                + "sales with " + sales[minSalesId]);

        //enter quotas
        System.out.println("Please enter quota: ");
        quota = scan.nextInt();

        //output those that met quotas
        System.out.println("\nThose that met quota");
        System.out.println("-------------------");
        for (int i =0 ; i<sales.length; i++){
            if(sales[i]>=quota){
                System.out.println("    "  + (i+1) + "    " +sales[i]);
                quotaMeeters++;
            }
        }

        //output total salespeople that met quota
        System.out.println("\nTotal that meet quotas: " + quotaMeeters);

    }

}
