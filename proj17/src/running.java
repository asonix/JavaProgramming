//Riley Trautman
//03.27.14
import java.util.*;
import java.io.*;
public class running {
	public static void main(String args[]) {
		String qqq = "thisxywasxyaxytriumph";
		Scanner scanVar = new Scanner(qqq);
		scanVar.useDelimiter("xy");
		while(scanVar.hasNext()) {
			System.out.println(scanVar.next());
		}
	}
}
