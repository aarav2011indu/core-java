package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] array1 = {"abc","pqr","xyz","asdasd","fghh"};

ArrayList<String>list1 = new ArrayList<String>();

list1.add("john");
list1.add("wick");
list1.add("rick");
list1.add("nick");
list1.add("hick");


System.out.println("list is this" + list1);
System.out.println("size of array list is " + list1.size());
list1.remove(3);
System.out.println("list is after removing " + list1);
System.out.println("size after removal " + list1);
System.out.println("the data at 4th position is " + list1.get(3));

list1.set(0,"dick");
System.out.println("after replacing new list is " +list1 );
list1.add(1,"john");
System.out.println("list after adding"  +list1);
Collections.sort(list1);
System.out.println(list1);
Collections.reverse(list1);
for(int index=0;index<list1.size();index++)
	

{
	System.out.println(list1.get(index));
	
}
for(String name:list1)
{
	System.out.println(name);
}


	
for(int index=0;index<list1.size();index++)
{
	if (list1.get(index).contains("wick")) {
		
	}
	System.out.println(index);
	break;

}
}
}