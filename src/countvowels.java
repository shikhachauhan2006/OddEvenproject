import java.util.Scanner;
public class countvowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement");
		String statement=sc.nextLine();
		int countvowels=0;
		String statementwithoutvowels="";
		for(char s:statement.toCharArray()) {
			if("aeiouAEIOU".indexOf(s)>=0)countvowels++;else statementwithoutvowels+=s;
		}
		System.out.println("Total number of vowels:"+countvowels);
		System.out.println("Statement without vowels:"+statementwithoutvowels);
		
	}

}
