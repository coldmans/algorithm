import java.util.Scanner;
import java.util.Arrays;
class Student implements Comparable<Student>{
    String names;
    int korean;
    int english;
    int math;

    Student(String names, int korean, int english, int math){
        this.names = names;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        if(this.korean == student.korean){
            if(this.english == student.english){
                return student.math - this.math;
            }
            return student.english - this.english;
        } 
        return student.korean - this.korean;
    }

    @Override
    public String toString(){
        return names + " " + korean + " " + english + " " + math;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }
        // Please write your code here.
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            students[i] = new Student(names[i], korean[i], english[i], math[i]);
        }
        Arrays.sort(students);
        for(Student s : students){
            System.out.println(s);
        }
        sc.close();
    }
}