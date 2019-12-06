package grocery;

import java.util.*;
import grocery.GroceryItems;



public class GroceryList {

    static private Map<String, List<Map<String,Integer>>> groceryListMap = new HashMap<>();
    static private List<Map<String, Integer>> groceryItemsList = new ArrayList<>();

    static private ArrayList<String> categories = new ArrayList<>(Arrays.asList("1: Meats", "2: Dairy", "3: Grains",
            "4: Produce"));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to input a grocery list?");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){

            System.out.println("Would you like to enter a new item?");
            String response = sc.nextLine();

                if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                    System.out.println(categories);

                        int num = sc.nextInt();
                        if (num == 1) {
                            System.out.println("You chose the meat category, what would you like to add?");
                            sc.nextLine();
                            String item = sc.nextLine();
                            System.out.printf("Excellent choice! How many %s would you like? \n", item);
                            int itemNum = sc.nextInt();
                            System.out.printf("So out of the meat, you chose %n %s", itemNum, item);

                            Map<String, Integer> groceryItem = new HashMap<>();
                            groceryItem.put(item, itemNum);
                            groceryItemsList.add(groceryItem);
                            groceryListMap.put("Meat", groceryItemsList);
                            System.out.println(groceryListMap.toString());
                        } else if (num == 2) {
                            System.out.println("You chose the dairy category, what would you like to add?");
                            sc.nextLine();
                            String item = sc.nextLine();
                            System.out.printf("Excellent choice! How many %s would you like? \n", item);
                            int itemNum = sc.nextInt();

                            Map<String, Integer> groceryItem = new HashMap<>();
                            groceryItem.put(item, itemNum);
                            groceryItemsList.add(groceryItem);
                            groceryListMap.put("Dairy", groceryItemsList);
                            System.out.println(groceryListMap.toString());
                        } else if (num == 3) {
                            System.out.println("You chose the grains category, what would you like to add?");
                            sc.nextLine();
                            String item = sc.nextLine();
                            System.out.printf("Excellent choice! How many %s would you like? \n", item);
                            int itemNum = sc.nextInt();

                            Map<String, Integer> groceryItem = new HashMap<>();
                            groceryItem.put(item, itemNum);
                            groceryItemsList.add(groceryItem);
                            groceryListMap.put("Grain", groceryItemsList);
                            System.out.println(groceryListMap.toString());
                        } else if (num == 4) {
                            System.out.println("You chose the produce category, what would you like to add?");
                            sc.nextLine();
                            String item = sc.nextLine();
                            System.out.printf("Excellent choice! How many %s would you like? \n", item);
                            int itemNum = sc.nextInt();

                            Map<String, Integer> groceryItem = new HashMap<>();
                            groceryItem.put(item, itemNum);
                            groceryItemsList.add(groceryItem);
                            groceryListMap.put("Produce", groceryItemsList);
                            System.out.println(groceryListMap.toString());
                        } else {
                            System.out.println("Sorry that's not an option for a category");
                        }

                } else {
                    System.out.println("Have a great day!");
                }
        } else {
            System.out.println("Have a Good day!");
        }
    }

}
