package arrays;

import java.util.Scanner;


public class ProductArrays {
    public static void main(String[] args) {

        String[] productsList = {"Phone", "Notebook", "Headphone", "Tablet", "Watch", "Tablet", "Phone"};
        int numbers = 0;
        int count = 0;
        System.out.print("Product list: \n");

        for (int num = 0; num < productsList.length; num++) {
            String product = productsList[num];
            numbers++;
            System.out.printf("%d) %s \n", numbers, product);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter product name: ");

        String productSearch = scan.next();

        for (String productName : productsList) {
            if (productName.equals(productSearch)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.printf("The product: %s, was found in the amount of %d pieces", productSearch, count);
        }
        if (count <= 0) {
            System.out.print("There is no product listed");
        }


    }


}



