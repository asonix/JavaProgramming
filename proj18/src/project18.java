//Riley Trautman
//05.09.14
import java.util.*;
public class project18 {
	public static void main(String args[]) {
		// COUNT 'EM UP RIGHT
		System.out.println("COUNT 'EM UP RIGHT");
		String input = "";
		do {
			System.out.print("Type the sentence and press ENTER: ");
			Scanner yeah = new Scanner(System.in);
			System.out.println("");
			
			input = yeah.nextLine();
			input = input.toUpperCase();
			input = input.replaceAll("\\s*", "");
			String processing = input + "ATTEMPT";
			String inarr[] = processing.split("S");
			
			int counter = 0;
			for (int i = 0; i < inarr.length; i++) {
				if (inarr[i].indexOf("A") == 0) {
					counter++;
				}
			}
			System.out.println("There are " + counter + " occurences.");
		} while(!input.equals("EXIT"));
		
		// ARRAY OF HOPE
		System.out.println("");
		System.out.println("ARRAY OF HOPE");
		char alpha[] = new char[26];
		for (int i = 65; i <= 90; i++) {
			alpha[i-65] = (char)i;
		}
		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i]+", ");
		}
	}
}
