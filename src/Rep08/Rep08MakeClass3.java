import java.util.Scanner;

public class Rep08MakeClass3 implements Rep08MakeClass1 {
	private int n;
	
	public Rep08MakeClass3(int n) {
		this.n = n;
	}
	
	public String encode(String plainText) {
		String result = plainText;
		
		for(int i = 0; i < n; i++) {
			result = shuffle(result);
		}
		
		return result;
	}
	
	private String shuffle(String str) {
		int mid = (str.length() + 1) /2;
		
		String first = str.substring(0, mid);
		String second = str.substring(mid);
		
		String result = "";
		
		int i = 0;
		int j = 0;
		
		while(i < first.length() || j < second.length()) {
			if(i < first.length()) {
				result += first.charAt(i);
				i++;
			}
			if(j < second.length()) {
				result += second.charAt(j);
				j++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a N for shufflings: ");
		int n = s.nextInt();
		s.nextLine();
		
		System.out.print("Enter a string: ");
		String str = s.nextLine();
		
		Rep08MakeClass3 makeClass = new Rep08MakeClass3(n);
		
		System.out.println("Res: " + makeClass.encode(str));
	}
}

