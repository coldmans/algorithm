import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.next().split("\\.");
    System.out.println(arr[1] + "-" + arr[2] + "-" + arr[0]);
}}