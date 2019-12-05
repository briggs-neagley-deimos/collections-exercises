import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;



public class GroceryList {

    static private ArrayList<String> categories = new ArrayList<>(Arrays.asList("poultry", "dairy", "grains",
            "produce"));
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to input a grocery list?");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
            System.out.println("Have a Good day!");
        } else {
            System.out.println("Would you like to enter a new item?");
            String response = sc.nextLine();
            if (!response.equalsIgnoreCase("yes") || !response.equalsIgnoreCase("y")){
                System.out.println("Have a good day!");
            } else {
                System.out.println(categories);
            }
        }
    }

}
