package test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str = "agfghjhkjkjklklkklkjlfggffg";
		Scanner scanner = new Scanner(System.in);
		

		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("reverse string is:" + sb);

		// TODO Auto-generated method stub

	}

}
