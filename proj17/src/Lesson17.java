//Riley Trautman
import java.io.*;
import java.util.*;
public class Lesson17 {
	public static void main(String args[]) {
		String s = "Lucky hockey puck";
		String m = "uck";
		int j = 6,z = 99;
		
		int k = s.indexOf(m);
		System.out.println(k);
		
		int l = s.indexOf("uck",j);
		System.out.println(l);
		
		int n = s.indexOf('c');
		System.out.println(n);
		
		String str = s.replace('o', 'p');
		System.out.println(str);
		
		int o = s.lastIndexOf(m,j+3);
		System.out.println(o);
		
		char p = s.charAt(7);
		System.out.println(p);
		
		int q = s.indexOf(z);
		System.out.println(q);
		
		int r = s.lastIndexOf(m);
		System.out.println(r);
		
		int t = s.indexOf('y',j);
		System.out.println(t);
		
		char u = s.charAt(z-90);
		System.out.println(u);
		
		int v = s.indexOf(m,15);
		System.out.println(v);
		
		int w = s.indexOf(z+2,4);
		System.out.println(w);
		
		int x = s.lastIndexOf('h');
		System.out.println(x);
		
		int y = s.lastIndexOf(121);
		System.out.println(y);
		
		String a = s.replace('y', 'A');
		System.out.println(a);
		
		String xyz = "bathtub";
		String ddd = "BathTUB";
		String ccc = xyz;
		String wc = "Whooping crane";
		String ss = "    \t\tGu daaymates  \n";
		
		int jj = xyz.compareTo(wc);
		boolean bb;
		if (jj>0) {
			bb = true;
		} else {
			bb = false;
		}
		System.out.println(bb);
		
		String vv = ddd.toLowerCase();
		int fg = ccc.compareTo(vv);
		System.out.println(fg + 1);
		
		System.out.println(ddd.compareTo(ccc));
		System.out.println(xyz.compareTo(ccc));
		System.out.println("Stupid".compareTo(ddd));
		System.out.println(">>>"+s.trim() + "<<<");
		
		String mm = "Good morning, how may I help you? I289 56";
		Scanner sc = new Scanner(mm);
		
		System.out.println(sc.next());
		
		sc.skip("\\s*mo");
		String sss = sc.next();
		System.out.println(sss);
		
		sc.useDelimiter("\\s+I");
		System.out.println(sc.next());
		
		sc.findInLine("el");
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		
		sc.useDelimiter("\\s+");
		System.out.println(sc.nextInt());
	}
}
//1. 1
//2. 14
//3. 2
//4. Lucky hpckey puck
//5. 1
//6. o
//7. 2
//8. 14
//9. 11
//10. k
//11. -1
//12. 10
//13. 6
//14. 11
//15. LuckA hockeA puck
//16. true
//17. 1
//18. -32
//19. 0
//20. 17
//21. >>>Lucky hockey puck<<<
//22. Good
//23. rning,
//24.  how may
//25. true
//25. p you?
//26. Error due to next not being int
