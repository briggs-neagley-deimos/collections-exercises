package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;

    static ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

        // returns the student's name
        public String getName(){
            return name;
        }
// adds the given grade to the grades property
        public void addGrade(int grade){
            grades.add(grade);
        }
// returns the average of the students grades
        public double getGradeAverage(){

            double gradesTotal = 0;
            double gradesAvg;

            for (int i = 0; i < grades.size(); i++) {
                gradesTotal += grades.get(i);
            }
            gradesAvg = gradesTotal/grades.size();
            return gradesAvg;
        }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public static void main(String[] args) {
        Student alyssa = new Student("Alyssa");
        System.out.println(alyssa.getName());
        alyssa.addGrade(50);
        alyssa.addGrade(75);
        alyssa.addGrade(90);
        alyssa.addGrade(100);
        System.out.println(alyssa.getGradeAverage());

        Student kellsey = new Student("Kellsey");
        System.out.println(kellsey.getName());
        kellsey.addGrade(30);
        kellsey.addGrade(45);
        kellsey.addGrade(90);
        kellsey.addGrade(80);
        System.out.println(kellsey.getGradeAverage());

        Student karli = new Student("Karli");
        System.out.println(karli.getName());
        karli.addGrade(50);
        karli.addGrade(60);
        karli.addGrade(70);
        karli.addGrade(80);
        System.out.println(karli.getGradeAverage());

        Student nico = new Student("Nico");
        System.out.println(nico.getName());
        nico.addGrade(80);
        nico.addGrade(75);
        nico.addGrade(10);
        nico.addGrade(10);
        System.out.println(nico.getGradeAverage());

    }
}
