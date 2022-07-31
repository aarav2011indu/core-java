package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "clean world green world";
		int count = 0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			switch(ch) {
			case'a':
				count++;
				break;
			case'e':
				count++;
				break;
			case'i':
				count++;
				break;
			case'o':
				count++;
				break;
			case'u':
				count++;
				break;
				
			}
			System.out.println("total vowels are" +count);
			}
	}

}
