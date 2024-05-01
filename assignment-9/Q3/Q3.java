package assignment9;

import java.util.StringTokenizer;

public class Q3 {
	
	void count() {
		
		String data = "The class String includes methods for examining individual characters of the sequence,for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.";
		StringTokenizer str=new StringTokenizer(data);
		System.out.println("count="+str.countTokens());
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}
	}

}
