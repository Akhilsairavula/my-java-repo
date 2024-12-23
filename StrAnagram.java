package stringdemo;

import java.util.Scanner;

public class StrAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		char eachCh =  ' ';
		
		boolean isAnagram = true;
		if(str1.length() == str2.length()) {
			for(int i=0;i<str1.length();i++) {
				eachCh = str1.charAt(i);
				if(isCharThere(str2,eachCh) == false) {
					isAnagram = false;
					break;
					//if
				}
			}
		}

	}

	private static boolean isCharThere(String str2, char eachCh) {
		// TODO Auto-generated method stub
		return false;
	}

}
