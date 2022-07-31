package test;

public class Vowelscheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "clean world green world";
str = str.toLowerCase();
int count = 0;
for(int i=0;i<str.length();i++)
{
	char ch = str.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		count++;
	}
}
System.out.println("the vowel count is " + count);
	}

}
