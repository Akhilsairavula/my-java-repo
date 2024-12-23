package stringdemo;

import java.util.Scanner;

public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		String data = sc.nextLine();
		data = data.toUpperCase();
		
		int[]count = {
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
		};
		char ch =' ';
		int index;
		for(int i=0;i<data.length();i++) {
			ch = data.charAt(i);
			if(ch >='A' && ch <='Z') {
				index = (int)(ch -65);
				count[index]++;
			}
		}
		for(int i=0;i<26;i++) {
			if(count[i] > 0)
				System.out.println("["+(char)(i+65)+"]--->"+count[i]);
				
			}
		}
		

	}


