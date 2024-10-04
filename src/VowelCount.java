import java.util.Scanner;
public class VowelCount {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Statement");
			String Statement=sc.nextLine();
			int VowelCount=0;
			String Stringwithoutvowels="";
			for(char s:Statement.toCharArray()){
				if("aieouAIEOU".indexOf(s)>=0)VowelCount++;else Stringwithoutvowels+=s;
				}
			System.out.println("Number of Vowels:"+VowelCount);
			System.out.println("Stringwithoutvowels:"+Stringwithoutvowels);
		}
		}
		}
		
		
		
		
			
		
	


