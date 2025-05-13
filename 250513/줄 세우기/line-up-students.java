import java.util.Scanner;
import java.util.Arrays;
class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;
    Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }
    @Override
    public int compareTo(Student s){
        if(this.height == s.height){
            if(this.weight == s.weight){
                return this.num - s.num;
            }
            return s.weight - this.weight;
        }
        return  s.height - this.height;
    }
    @Override
    public String toString(){
        return height + " " + weight + " " + num;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        // Please write your code here.
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            students[i] = new Student(height[i], weight[i], i+1);
        }
        Arrays.sort(students);
        for(Student s : students){
            System.out.println(s);
        }
    }
}