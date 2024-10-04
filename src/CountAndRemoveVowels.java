
public class CountAndRemoveVowels {
	public static void main(String[] args) {
		String statement="Java is a high level and Object Oriented Language";
		int vowelcount=0;
		StringBuilder withoutvowels=new StringBuilder();
		for(int i=0;i<statement.length();i++) {
			char c=statement.charAt(i);
			if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				vowelcount++;
				
			}else {
				withoutvowels.append(c);
			}
		}
		System.out.println("Number of Vowels:"+ vowelcount);
		System.out.println("Statement wtihout vowels :" +withoutvowels.toString()); 
		

	}

}
