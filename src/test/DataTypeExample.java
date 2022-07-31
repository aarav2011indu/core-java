package test;

public class DataTypeExample {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;
		int sum = num1 + num2;
		int mul = num1 * num2;
		float div = (float) num1/num2;
		
		// TODO Auto-generated method stub
		System.out.println("sum of two number is " + sum);
		System.out.println(" the multiplication of two number is " + mul);
		System.out.println(num1 + num2);
		System.out.println(div);
		String str1 = ("clean world green world");
		System.out.println(str1);
		System.out.println(" the length of string is " + str1.length());
		char ch1 = str1.charAt(0);
				System.out.println("the first char is " + ch1);
				char ch2 = str1.charAt(str1.length() -1);
				System.out.println( "the last char is " + ch2);
				System.out.println("the string in upper case is" + str1.toUpperCase());
				System.out.println("the string in upper case is" + str1.toLowerCase());
				

	}

}
