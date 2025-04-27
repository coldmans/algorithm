public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5;
        int b = 6;
        int c = 7;

        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        tmp = a;
        a = c;
        c = tmp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}