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
		System.out.println("");
	}
}
public static void duplicateRemove(String s)
	{
		StringBuffer s2=new StringBuffer();
		char c[]=s.toCharArray();
		int length=c.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]=c[length-1];
					j--;
					length--;
				}
			}
			s2=s2.append(c[i]);
		}
		
	   String s1=new String(s2);
	   System.out.println(s1);
	} 
	public static void rotation(String str1, String str2) {
		 StringBuffer sb=new StringBuffer("");
		 for (int i = str2.length()-1; i >=0 ; i--) {
			sb=sb.append(str2.charAt(i));
		}
		 System.out.println(sb);
		 String s=sb.toString();
		   if(s.equals(str1)) {
			  System.out.println("both strings are rotation of each other");
		   }
		   else {
			   System.out.println("both strings are not rotation of each other");
		   }
		   
	   }
}