import java.util.Scanner;

//Riley Trautman
public class Crypto {
	public String encrypt(String sntnc) {
		Scanner s = new Scanner(sntnc);
		s.useDelimiter("");
		
		String total = "";
		
		while(s.hasNext()) {
			String t = s.next();
			
			t = t.toLowerCase();
			
			if (t.equals("v")) {
				total += "ag',r";
			}
			else if (t.equals("m")) {
				total += "ssad";
			}
			else if (t.equals("g")) {
				total += "jeb..w";
			}
			else if (t.equals("b")) {
				total += "dug>?/";
			}
			else {
				total += t;
			}
		}
		
		return(total);
	}
	public String decrypt(String sntnc) {
		String output = sntnc;

		output = output.replaceAll("jeb..w", "g");

		output = output.replaceAll("ssad", "m");
		
		output = output.replaceAll("ag',r", "v");

		output = output.replaceAll("dug>\\?/", "b");
		return(output);
	}
}
