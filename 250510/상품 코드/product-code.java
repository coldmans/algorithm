import java.util.Scanner;
class product{
    String name;
    int code;
    product(){
        this.name = "codetree";
        this.code = 50;
    }
    product(String name, int code){
        this.name = name;
        this.code = code;
    }
    void showProduct(){
        System.out.println("product " + code + " is " + name);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        product p1 = new product();
        product p2 = new product(id2, code2);
        p1.showProduct();
        p2.showProduct();
    }
}