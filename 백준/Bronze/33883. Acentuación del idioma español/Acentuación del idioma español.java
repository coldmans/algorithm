
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char a = input.charAt(input.length()-1);
		int tmp = 2;
		char []str = {'a','e','i','o','u'};
		boolean waxi = false;
		for(int i = 0; i < 5; i++) {
			if(a== 'n' || a == 's') {
				tmp -= 1;
				if(a == str[i]) waxi = true;
				break;
			}
		}
		int res = -2;
		for(int i = input.length()-2; i >= 0; i--) {
			if(res != -2) break;
			for(int j = 0; j < 5; j++) {
				if(input.charAt(i) == str[j]) {
					if(tmp == 2 || waxi) {
						res = i;
						break;
					}
					else if(tmp == 1) {
						tmp += 1;
					}
				}
			}
		}
		System.out.println(res+1);
		

	}	
}













