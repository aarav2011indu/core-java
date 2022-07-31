package collection;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map1 = new HashMap<Integer,String>();
map1.put(1, "not");
map1.put(2, "lot");
map1.put(3, "dot");
map1.put(4, "hot");
map1.put(-2, "cot");
map1.put(1, "orange");
map1.put(100, "aarav");
System.out.println(map1);
System.out.println("Data at 4th key is " +map1.get(-2));
System.out.println("Data at 100th key is " +map1.get(100));

map1.remove(100);
System.out.println(map1);
for(Integer key:map1.keySet())
{
	System.out.println(" key is :" + key);
	System.out.println(" value is :" + map1.get(key));
	
}
	}

}
