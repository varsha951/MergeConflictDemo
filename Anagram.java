public class Anagram {
public static void findAnagrams(String[] s1) {
	
	for (int i = 0; i < s1.length; i++) {
		System.out.print(s1[i]);
		for (int j = i+1; j < s1.length; j++) {
			int count=0;
			if (s1[i].length()==s1[j].length()) {
				for (int j2 = 0; j2 < s1[i].length(); j2++) {
					for (int k = 0; k < s1[j].length(); k++) {
						if (s1[i].charAt(j2)==s1[j].charAt(k)) {
							count++;
							break;
						}
					}
				}
				if(count==s1[i].length()) {
					System.out.print(" "+s1[j]);
				}
			}
		}
		System.out.println("       ");
	}
}

public static int isValidIP(String s) {
	String[]s1=s.split("[.]");
	boolean flag=false;
	if(s1.length==4) {
	for (int i = 0; i < s1.length; i++) {
		int a=Integer.parseInt(s1[i]);
		//System.out.println(a);
		if (a<0 || a>255) {
			flag=false;
			break;
		}
		else {
			flag=true;
			continue;
		}
}
