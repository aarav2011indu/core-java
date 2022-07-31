package collection;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "clean world green world";
String[] words = s1.split(" ");
HashMap<Integer,String> map1 = new HashMap<Integer,String>();

for(String word : words)
{
	if (map1.get(word) == null) {
		
	map1.put(1, word);
	}
	else
	{
		
		String oldOccu = map1.get(word);
		map1.put(oldOccu+1, word);
	}
}
System.out.println(map1);
}
	
	}


