import java.util.Scanner;

class nextLevel{
    String id;
    int level;
    nextLevel(){
        this.id = "codetree";
        this.level = 10;
    }
    nextLevel(String id, int level){
        this.id = id;
        this.level = level;
    }
    void showNextLevel(){
        System.out.println("user " + id + " lv " + level);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        nextLevel user1 = new nextLevel();
        nextLevel user2 = new nextLevel(id,level);
        user1.showNextLevel();
        user2.showNextLevel();
    }
}