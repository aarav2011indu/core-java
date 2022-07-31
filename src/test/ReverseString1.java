package test;

public class ReverseString1 {

	public static void main(String[] args) {
		String str = " clean world green world";
		
		String result = "";
		 for (int i= str.length()-1;i>=0;i--)
		 {
			 char ch = str.charAt(i);
			 result = result + ch ;
			 
		 }
		
		System.out.println("the result string is " + result);// TODO Auto-generated method stub

	
int num = 456789;
int res = 0;

while(num>0) {
	

 int rem = num%10;  //9
 res = res*10 + rem;
 num = num/10;
}
 System.out.println("the result num is " + res);

}
}