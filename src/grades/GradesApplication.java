package grades;

import java.util.*;

import grades.Student;

public class GradesApplication {

    static Student alyssa = new Student("Alyssa");
    static Student kellsey = new Student("Kellsey");
    static Student karli = new Student("Karli");
    static Student nico = new Student("Nico");

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        alyssa.addGrade(60);
        alyssa.addGrade(100);
        alyssa.addGrade(10);

        kellsey.addGrade(100);
        kellsey.addGrade(50);
        kellsey.addGrade(70);

        karli.addGrade(70);
        karli.addGrade(100);
        karli.addGrade(60);

        nico.addGrade(50);
        nico.addGrade(100);
        nico.addGrade(75);

        students.put("alyssabriggs", alyssa);
        students.put("kellseyn", kellsey);
        students.put("karlisteeves", karli );
        students.put("navirgino", nico);

        System.out.println("Welcome, here's a list of our current students\n");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.print("|" + entry.getKey() + "|");
        }
        System.out.println("\nPlease type out the user you want to see more about\n");
        String choosePerson = scanner.nextLine();
            if(students.containsKey(choosePerson)){
            System.out.println(students.get(choosePerson));
        }

//        for (String id : students.keySet()){
//            System.out.println("id = " + id);
//            System.out.println("getName = " + students.get(id).getName());
//            System.out.println("getGradeAverage = " + students.get(id).getGrades());
//        }


    }
}
