import java.util.Scanner;
import java.util.Arrays;
class Person{
    String name;
    int height;
    double weight;
    Person(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return name + " " + height + " " + weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
        }
        // Please write your code here.
        Person [] persons = new Person[5];
        for(int i = 0; i < 5; i++){
            persons[i] = new Person(names[i], heights[i], weights[i]);
        }
        System.out.println("name");
        Arrays.sort(persons, (a,b) -> a.name.compareTo(b.name));
        for(Person p : persons){
            System.out.println(p);
        }
        System.out.println();
        System.out.println("height");
        Arrays.sort(persons, (a,b) -> b.height - a.height);
        for(Person p : persons){
            System.out.println(p);
        }

    }
}