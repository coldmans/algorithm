

import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String am = scanner.next();
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for(char c : am.toCharArray()) {
			set.add(c);
		}
		for(int i = (int)('A'); i <= (int)('Z'); i++) {
			set.add((char)i);
		}
		for(char c: set) {
			sb.append(c);
		}
		am = sb.toString();
		HashMap<Character, Character> hash = new HashMap<>();
		for(int i = (int) ('A'); i <= (int) ('Z'); i++) {
			hash.put((char)i, am.charAt(i-(int)('A')));
		}
		
		String res = scanner.next();
		StringBuilder tmp = new StringBuilder();
		for(int i = 0; i < res.length(); i++) {
			tmp.append(hash.get(res.charAt(i)));
		}
		System.out.println(tmp);
		
		
	}
}


