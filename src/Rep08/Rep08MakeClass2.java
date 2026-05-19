import java.util.Scanner;

public class Rep08MakeClass2 implements Rep08MakeClass1 {
	private int shift;
	
	public Rep08MakeClass2(int shift) {
		this.shift = shift;
	}
	
	public String encode(String plainText) {
		String result = "";
		
		for(int i = 0; i < plainText.length(); i++) {
			result += shiftChar(plainText.charAt(i));
		}
		
		return result;
	}
	
	private char shiftChar(char c) {
		if(c >= 'A' && c <= 'Z') {
			return (char)('A' + (c - 'A' + shift) % 26);
		} else if(c >= 'a' && c <= 'z') {
			return (char)('a' + (c - 'a' + shift) %26);
		} else {
			return c;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a shift number: ");
		int shift = s.nextInt();
		s.nextLine();
		
		System.out.print("Enter a string: ");
		String str = s.nextLine();
		
		Rep08MakeClass2 makeClass = new Rep08MakeClass2(shift);
		
		System.out.println("Res: " + makeClass.encode(str));
	}
}

