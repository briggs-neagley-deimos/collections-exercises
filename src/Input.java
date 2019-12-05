import java.util.Scanner;

public class Input {

    public Scanner scanner = new Scanner(System.in);

        String getString(){
            System.out.println("Tell me something good...");
            String input = scanner.nextLine();
            return input;
        }
        boolean yesNo(){
            System.out.println("Do you understand the content?");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
                return true;
            } else {
                return false;
            }
        }
        public int getInt(int min, int max){
            System.out.println("Please guess a number: ");
            int input = Integer.parseInt(scanner.nextLine());
            if (input < min){
                System.out.println("That number is too low!");
                return getInt(min,max);
            } else if (input > max){
                System.out.println("Try shooting for a lower number..");
                return getInt(min,max);
            } else {
                System.out.println("Perfect!");
            }
            return input;
        }
        public int getInt(){
            System.out.println("What's your favorite number?");
            int input = Integer.parseInt(scanner.nextLine());
            return input;
        }
        double getDouble(double min, double max){
            System.out.println("Please guess a decimal number:");
            double input = Double.parseDouble(scanner.nextLine());
            if (input < min){
                System.out.println("That number is too low!");
                return getDouble(min, max);
            } else if (input > max){
                System.out.println("Try shooting for a lower number..");
                return getDouble(min, max);
            } else {
                System.out.println("Perfect!");
            }
            return input;
        }
        double getDouble(){
            System.out.println("What's your second favorite number?");
            double input = Double.parseDouble(scanner.nextLine());
            return input;
        }

}
