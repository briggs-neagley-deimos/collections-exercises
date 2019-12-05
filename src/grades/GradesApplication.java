package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication extends Student{
    public GradesApplication(String name, ArrayList<Integer> grades) {
        super(name, grades);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Object> students = new HashMap<>();
        students.put("alyssabriggs", alyssa);
        students.put("kellseyn", "kellsey");
        students.put("karlisteeves", "karli");
        students.put("navirgino", "nico");

        System.out.println("Welcome, here's a list of our current students\n");
        for (HashMap.Entry<String, String> entry : students.entrySet()) {
            System.out.print("|" + entry.getKey() + "|");
        }
        System.out.println("\nPlease type out the user you want to see more about\n");
        String choosePerson = scanner.nextLine();
            if(students.containsKey(choosePerson)){
            System.out.println(students.get(choosePerson) + (getName(choosePerson)));
        }

    }
}
