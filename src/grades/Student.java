package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;

    static ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
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

    public static void main(String[] args) {
        Student alyssa = new Student("Alyssa", grades);
        System.out.println(alyssa.getName());
        alyssa.addGrade(35);
        alyssa.addGrade(75);
        alyssa.addGrade(90);
        alyssa.addGrade(100);
        System.out.println(alyssa.getGradeAverage());

    }
}
