import java.util.*;

public class Main {
	public static void main(String args[]) {
		int n = 0, sum = 0;
		int num = 0;
		char ch = ' ';
		String str = new String();
		
		Scanner scanner = new Scanner(System.in);
		n = Integer.parseInt(scanner.nextLine());
		str = scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			ch = str.charAt(i);
			num = ch - '0';
			sum += num;
		}
		System.out.println(sum);
	}
}