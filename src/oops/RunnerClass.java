package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee E1 =  new Employee();
 E1.Name = "Mike";
 E1.Empid = 1000;
 E1.Department = "HR";
 E1.Display();
 

 Employee E2 =  new Employee("jack", 1001, "finance");
 
 

 E2.Display();
 Bank B = new Bank();
 B.DisplayBalance();
 int Bal = B.GetBalance();
 System.out.println( "the balance is " + B.GetBalance());
 System.out.println( "the balance is " + Bal);
 BoaBank B1 = new BoaBank();
 B1.CCBalance();
 B1.DisplayBalance();
 
 
 B1.Accountnum = 100;
 OverLoadingExample obj = new OverLoadingExample();
 int RecArea = obj.Getarea(3,4);
 int SqArea  = obj.Getarea(4);
 System.out.println(RecArea);
 System.out.println(SqArea );
 B1.CloseAccount(12346);
B.CloseAccount(12346);
  Chrome ch = new Chrome();
  ch.OpenBrowser();
  
  Browser Br = new Chrome();
  Br.OpenBrowser();
  Br.CloseBrowser();
  Br.DisplayName();
  HondaCar c = new HondaCar();
  CarInterface i = new HondaCar();
  EncapsulationEx En =  new EncapsulationEx();
  En.setBalance(3000);
  System.out.println(En.getBalance());
  
	}

}