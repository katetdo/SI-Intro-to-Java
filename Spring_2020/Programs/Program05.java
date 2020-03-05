package Spring_2020.Programs;
import java.util.Scanner;
public class Program05 {
	public static void main (String[]args) {
		
		String user = "blank";
		String right = "";
		String left = "";
		int place = 0;
		boolean spot = false;
		
		Scanner stdIn = new Scanner(System.in);
		//using a for loop
		/*while(user!=""){
			System.out.println("Please enter a word to translate into pig latin");
			user = stdIn.nextLine();
			
			for(int i = 0; i< user.length(); ++i) {
				char c = user.charAt(i);
				if(!spot && c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
					spot=true;
					place = i;
					
				}
			}
		}*/
		
		//while(user!=""){
			System.out.println("Please enter a word to translate into pig latin");
			user= stdIn.nextLine();
			int i =-1;
			while(!spot) {
				++i;
				char c = user.charAt(i);
				if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
					spot=true;
				} else {
					left += c; 
					
				}
				
			}
			while(i<user.length()) {
				right+=user.charAt(i);
				++i;
			}
			String newString = right+left+"ay";
			System.out.println(newString);
		//}
		
	}
}
