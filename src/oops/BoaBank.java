package oops;

public class BoaBank extends Bank {
 public int creditcardnum;
 int AccountNum;
 public void CCBalance()
 {
	 System.out.println("inside CC balance");
	 this.creditcardnum = 1000;
	 super.Accountnum = 123456;
	 this.Accountnum = 7890;
 }
 public void CloseAccount(int i)
 {
 	System.out.println("inside bank closeAccount");
 }

}
