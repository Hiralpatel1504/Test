package com.test.calc;

import java.util.Scanner;

public class CalcProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a, b, res;
		char choice;
		Scanner sinput = new Scanner(System.in);

		do {
			System.out.println("Select Operation : \n"
					+ " A.Addition \n S.Subtraction \n M.Multiplication \n D.Division \n E.Exit\n");

			System.out.print("Enter your choice : ");

			choice = sinput.next().charAt(0);

			switch (choice) {
			case 'A':
				System.out.print("Enter First number : ");
				a = sinput.nextFloat();
				System.out.print("Enter Second number : ");
				b = sinput.nextFloat();
				res = a + b;
				System.out.print("Result : " + res + "\n");
				break;

			case 'S':

				System.out.print("Enter First number : ");
				a = sinput.nextFloat();
				System.out.print("Enter Second number : ");
				b = sinput.nextFloat();
				res = a - b;
				System.out.print("Result : " + res + "\n");
				break;

			case 'D':
				System.out.print("Enter First number : ");
				a = sinput.nextFloat();
				System.out.print("Enter Second number : ");
				b = sinput.nextFloat();
				res = a / b;
				System.out.print("Result : " + res + "\n");
				break;

			case 'M':
				System.out.print("Enter First number : ");
				a = sinput.nextFloat();
				System.out.print("Enter Second number : ");
				b = sinput.nextFloat();
				res = a * b;
				System.out.print("Result : " + res + "\n");
				break;

			case 'E':
				System.exit(0);
				break;
			default:
				System.out.print("Wrong Choice.....\n");
				break;
			}
		} while (choice != 'E');
	}
}
