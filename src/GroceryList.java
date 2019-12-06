import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;



public class GroceryList {

    static private ArrayList<String> categories = new ArrayList<>(Arrays.asList("1: Meats", "2: Dairy", "3: Grains",
            "4: Produce"));
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to input a grocery list?");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){

            System.out.println("Would you like to enter a new item?");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")){
                System.out.println(categories);
                int num = sc.nextInt();
                if(num == 1){

                    System.out.println("You chose the meat category, what would you like to add?");
                    sc.nextLine();
                    String item = sc.nextLine();
                    System.out.printf("Excellent choice! How many %s would you like?", item);
                    sc.nextLine();
                    int itemNum = sc.nextInt();
                    System.out.println("So out of the meat, you chose % %s", itemNum, item);
                } else if(num == 2){
                    System.out.println("You chose the dairy category, what would you like to add?");
                    sc.nextLine();
                    String item = sc.nextLine();
                    System.out.printf("Excellent choice! How many %s would you like?", item);
                    sc.nextLine();
                    int itemNum = sc.nextInt();
                } else if(num == 3){
                    System.out.println("You chose the grains category, what would you like to add?");
                    sc.nextLine();
                    String item = sc.nextLine();
                    System.out.printf("Excellent choice! How many %s would you like?", item);
                    sc.nextLine();
                    int itemNum = sc.nextInt();
                } else if(num ==4){
                    System.out.println("You chose the produce category, what would you like to add?");
                    sc.nextLine();
                    String item = sc.nextLine();
                    System.out.printf("Excellent choice! How many %s would you like?", item);
                    sc.nextLine();
                    int itemNum = sc.nextInt();
                }else{
                    System.out.println("Sorry that's not an option for a category");
                }

            }else {
                System.out.println("Have a good day!");
            }
        } else {
            System.out.println("Have a Good day!");
        }
    }

}
