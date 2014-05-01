//Riley Trautman
//03.27.14

import java.io.*;
import java.util.*;

public class project17 {
	public static void main(String args[]) {
		
		//ADD EM' UP
		System.out.print("Enter something like 8 + 33 + 1,345 +137 : ");
		
		Scanner q = new Scanner(System.in);
		String e = q.nextLine();
		e.replaceAll("\\s*","");
		
		Scanner equation = new Scanner(e);
		equation.useDelimiter("\\s*\\+\\s*");
		
		int total = 0;
		
		while(equation.hasNext()) {
			String g = equation.next();
			Scanner f = new Scanner(g);
			f.useDelimiter("\\s*\\-\\s*");
			
			int sub = f.nextInt();
			
			while(f.hasNextInt()) {
				sub -= f.nextInt();
			}
			total += sub;
		}
		System.out.println("total:");
		System.out.println(total);
		
		//ENCRYPTION/DECRYPTION
		Scanner kbReader = new Scanner(System.in);
		System.out.print("Enter a sentence that is to be encrypted: ");
		String sntnc = kbReader.nextLine();
		System.out.println("Original sentence = " + sntnc);
		
		Crypto myCryptObj = new Crypto();
		String encryptdSntnc = myCryptObj.encrypt(sntnc);
		System.out.println("Encrypted sentence = " + encryptdSntnc);
		
		String decryptdSntnc = myCryptObj.decrypt(encryptdSntnc);
		System.out.println("Decrypted sentence = " + decryptdSntnc);
	}
}
