import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(".-", "A");
        hashMap.put("-...", "B");
        hashMap.put("-.-.", "C");
        hashMap.put("-..", "D");
        hashMap.put(".", "E");
        hashMap.put("..-.", "F");
        hashMap.put("--.", "G");
        hashMap.put("....", "H");
        hashMap.put("..", "I");
        hashMap.put(".---", "J");
        hashMap.put("-.-", "K");
        hashMap.put(".-..", "L");
        hashMap.put("--", "M");
        hashMap.put("-.", "N");
        hashMap.put("---", "O");
        hashMap.put(".--.", "P");
        hashMap.put("--.-", "Q");
        hashMap.put(".-.", "R");
        hashMap.put("...", "S");
        hashMap.put("-", "T");
        hashMap.put("..-", "U");
        hashMap.put("...-", "V");
        hashMap.put(".--", "W");
        hashMap.put("-..-", "X");
        hashMap.put("-.--", "Y");
        hashMap.put("--..", "Z");

        hashMap.put(".----", "1");
        hashMap.put("..---", "2");
        hashMap.put("...--", "3");
        hashMap.put("....-", "4");
        hashMap.put(".....", "5");
        hashMap.put("-....", "6");
        hashMap.put("--...", "7");
        hashMap.put("---..", "8");
        hashMap.put("----.", "9");
        hashMap.put("-----", "0");

        hashMap.put("--..--", ",");
        hashMap.put(".-.-.-", ".");
        hashMap.put("..--..", "?");
        hashMap.put("---...", ":");
        hashMap.put("-....-", "-");
        hashMap.put(".--.-.", "@");


        for (int i = 0; i < N; i++) {
            String text = sc.next();
            text = hashMap.get(text);
            System.out.print(text + "");

        }
    }
}
