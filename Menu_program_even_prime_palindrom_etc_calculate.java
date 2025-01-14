package pattern;

import java.util.Scanner;

public class Menu_program_even_prime_palindrom_etc_calculate {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		System.out.println("             *!This is Menu cards following program!*");
		System.out.println("              -------------------------------------");
		System.out.println();
		System.out.print("1.Addition                           2.Substraction  "
				+ "\n3.Multiply                           4.divide  "
				+ "\n5.Even number      6.odd number      7.print 1 to 100 even odd "
				+ "\n8.check prime                        9.1 to100 prime"
				+ "\n10.factors                           11.sum of digit "
				+ "\n12.count digit                       13.rev number"
				+ "\n14.Palandrom num                     15.fabinoic seares "
				+ "\n16.check harshad number              17.1 to 1000 palindrom number"
				+ "\n18.1 to 1000 Harshad num             19.sum of series 1 to 100"
				+ "\n20.count factors                     21.1to 100 prime number count"
				+ "\n22.count palindrom num 1 to 1000     23.count 1 to 1000 harshad num"
				+ "\n24.sum of odd num                    25.calculate discout"
				+ "\n26.Find Square                       27.Area of rectngel and perimeter"
				+ "\n28.Calculate Simple interst          29.Coumpound interest"
				+ "\n30.Area of circle                    31.Find the cube"
				+ "\n32.Leap year or not                  33.swap the variable"
				+ "\n34.Eligible votr or not              35.profit | loss loss & profit print"
				+ "\n36.Factorial num                     37.Amstrong number" + "\n38.1 to 1000 armstrong number" + "\n"
				+ "\n0.press zero and break code");
		System.out.print("\n-------------------------------------------------------------------------");
		System.out.print("\n-------------------------------------------------------------------------");
		System.out.println("\n");

		int ch;
		int num1, num2;
		int cnt = 0;
//		int i=2;
		do {
			System.out.println("\nEnter following Choice and Calculate Opertion:");
			ch = Scan.nextInt();
			switch (ch) {

			case 1:

				System.out.println("Select choice is Addition");
				System.out.print("Enter num1 : ");
				num1 = Scan.nextInt();
				System.out.print("Enter num2 : ");
				num2 = Scan.nextInt();
				int sum = num1 + num2;
				System.out.println("Addtion is : " + sum);
				System.out.println("...................................");
				break;

			case 2:
				System.out.println("Select choice is Substraction");
				System.out.print("Enter num1 : ");
				num1 = Scan.nextInt();
				System.out.print("Enter num2 : ");
				num2 = Scan.nextInt();
				int sub = num1 - num2;
				System.out.println("Substraction is : " + sub);
				System.out.println("...................................");
				break;

			case 3:
				System.out.println("Select choice is Multifly");
				System.out.print("Enter num1 : ");
				num1 = Scan.nextInt();
				System.out.print("Enter num2 : ");
				num2 = Scan.nextInt();
				int mul = num1 * num2;
				System.out.println("Multifly is : " + mul);
				System.out.println("...................................");
				break;

			case 4:
				System.out.println("Select choice is divide");
				System.out.print("Enter num1 : ");
				num1 = Scan.nextInt();
				System.out.print("Enter num2 : ");
				num2 = Scan.nextInt();
				int div = num1 + num2;
				System.out.println("divide is : " + div);
				System.out.println("...................................");
				break;

			case 5:
				System.out.println("Select choice is Check even number:");
				System.out.print("Enter num: ");
				num1 = Scan.nextInt();
				if (num1 % 2 == 0) {
					System.out.println("Even number");
					System.out.println("...................................");
				}
				break;

			case 6:
				System.out.println("Select choice is check odd number");
				System.out.print("Enter num: ");
				num1 = Scan.nextInt();
				if (num1 % 2 != 0) {
					System.out.println("Odd number");
					System.out.println("...................................");
				}
				break;

			case 7:
				System.out.println("Select choice is 1 to 100 even odd print");
				System.out.print("Enter Range: ");
				num1 = Scan.nextInt();
				System.out.println("Even number: ");
				for (int i = 1; i <= num1; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
				System.out.println("Odd number: ");

				for (int j = 1; j <= num1; j++) {
					if (j % 2 != 0) {
						System.out.println(j);
						System.out.println("...................................");
					}
				}

				break;

			case 8:
				System.out.println("Select choice is check prime number or not");
				System.out.print("Enter num: ");
				num1 = Scan.nextInt();
				int i = 1;
				cnt = 0;
				for (i = 1; i <= num1; i++) {
					if (num1 % i == 0) {
						cnt++;

					}
				}
				if (cnt == 2) {
					System.out.println("Prime Number");
					System.out.println("...................................");
				} else {
					System.out.println("Not Prime Number");
					System.out.println("...................................");
				}
				break;

			case 9:
				System.out.println("Select choice is print 1 to 100 prime num");
				System.out.print("Enter Range: ");
				num1 = Scan.nextInt();
				for (int num = 1; num <= num1; num++) {
					int count = 0;
					for (int j = 1; j <= num; j++) {
						if (num % j == 0) {
							count++;
						}
					}
					if (count == 2) {
						System.out.println(num);
					}
				}
				System.out.println("...................................");
				break;

			case 10:
				System.out.println("Select choice is factors of num");
				System.out.print("Enter num: ");
				num1 = Scan.nextInt();
				for (i = 1; i <= num1; i++) {
					if (num1 % i == 0) {
						System.out.println(i);

					}
				}
				System.out.println("...................................");

				break;

			case 11:
				System.out.println("Select choice is Sum of digit");
				System.out.print("Enter num: ");
				num1 = Scan.nextInt();
				sum = 0;
				while (num1 > 0) {
					sum += num1 % 10;
					num1 = num1 / 10;

				}
				System.out.println("Sum of digit is: " + sum);
				System.out.println(".................................");
				break;

			case 12:
				System.out.println("Select choice is Count of digit");
				System.out.print("Enter num: ");
				num1 = Scan.nextInt();
				while (num1 > 0) {
					num1 = num1 / 10;
					cnt++;
				}
				System.out.println("Count of digit is: " + cnt);
				System.out.println(".....................................");

				break;

			case 13:
				System.out.println("Select Choice is Reverse Number");
				System.out.print("Enter number: ");
				num1 = Scan.nextInt();
				int rev = 0;
				while (num1 > 0) {
					int rem = num1 % 10;
					rev = rev * 10 + rem;
					num1 = num1 / 10;
				}
				System.out.println("Reverse number is: " + rev);
				System.out.println(".......................................");
				break;

			case 14:
				System.out.println("Select Choice is Palandrom num");
				System.out.print("Enter num: ");
				num1 = Scan.nextInt();
				int temp = num1;
				rev = 0;
				while (num1 > 0) {
					int rem = num1 % 10;
					rev = rev * 10 + rem;
					num1 = num1 / 10;
				}
				if (temp == rev) {
					System.out.println("Palindrom Number");
					System.out.println("......................................");
				} else {
					System.out.println("Not Palindrom Number");
					System.out.println("...............................................");
				}
				break;

			case 15:
				System.out.println("Select Choice is Fabinoic Seares");
				System.out.print("Enter Range: ");
				num1 = Scan.nextInt();
				int a, b, c;
				a = 0;
				b = 1;
				System.out.print("Fabinoic Seares is: " + a + " " + b);
				for (i = 1; i <= num1; i++) {
					c = a + b;
					System.out.print(" " + c + " ");

					a = b;
					b = c;
				}
				System.out.println("\n........................................");
				break;

			case 16:
				System.out.println("Select Choice Check Harshad number");
				System.out.print("Enter Number: ");
				num1 = Scan.nextInt();
				temp = num1;
				sum = 0;
				while (num1 > 0) {
					sum = num1 % 10;
					num1 = num1 / 10;
				}
				if (temp % sum == 0) {
					System.out.println("Harshad Number");
					System.out.println("................................");

				} else {
					System.out.println("Not Harshad Number");
					System.out.println("........................................");
				}

				break;

			case 17:
				System.out.println("Select Choice 1 to 1000 palindrom");
				System.out.println("Enter Range: ");
				num1 = Scan.nextInt();
				int Num;
				rev = 0;
				for (i = 1; i <= num1; i++) {
					Num = i;
					int tmp = i;
					rev = 0;
					while (Num > 0) {
						int rem = Num % 10;
						rev = rev * 10 + rem;
						Num = Num / 10;
					}
					if (tmp == rev) {
						System.out.println(tmp);
					}
				}
				System.out.println(".......................................................");

				break;

			case 18:
				System.out.println("Select Choice 1 to 1000 Harshad number");
				System.out.print("Enter Range: ");
				num1 = Scan.nextInt();
				sum = 0;
				int o_num;
				int num;
				for (i = 1; i <= num1; i++) {
					num = i;
					o_num = i;
					sum = 0;
					while (num > 0) {
						sum += num % 10;

						num = num / 10;
					}
					if (o_num % sum == 0) {
						System.out.println(o_num);
					}
				}
				System.out.println("....................................................");

				break;

			case 19:
				System.out.println("Select Choice is sum of searies 1 to 100");
				System.out.print("Enter the Range: ");
				num1 = Scan.nextInt();
				sum = 0;
				for (i = 1; i <= num1; i++) {
					sum += i;
				}
				System.out.println("Sum of searies: " + sum);
				System.out.println("....................................................");
				break;

			case 20:
				System.out.println("Select Choice is Count factors");
				System.out.print("Enter Number: ");
				num1 = Scan.nextInt();

				for (i = 1; i <= num1; i++) {
					if (num1 % i == 0) {
						cnt++;
//						System.out.println(i);
					}

				}
				System.out.println("Count of Factors is: " + cnt);
				break;

			case 21:
				System.out.println("Select Choice is 1 to 100 count prime number");
				System.out.print("Enter Range: ");
				num1 = Scan.nextInt();
				num = 1;
				i = 1;
				int cnt1 = 0;
				for (num = 1; num <= num1; num++) {
					cnt = 0;
					for (i = 1; i <= num; i++) {
						if (num % i == 0) {
							cnt++;
						}
					}
					if (cnt == 2) {
						System.out.println(num);
						cnt1++;
					}
				}
				System.out.println("1 to 100 prime number count is: " + cnt1);
				break;

			case 22:
				System.out.println("Select Choice is Count palindrom number");
				System.out.print("Enter Range: ");
				num1 = Scan.nextInt();

				for (i = 1; i <= num1; i++) {
					num = i;
					o_num = i;
					rev = 0;
					while (num > 0) {

						int rem = num % 10;
						rev = rev * 10 + rem;
						num = num / 10;

					}
					if (o_num == rev) {
//						System.out.println(o_num);
						cnt++;
					}
				}
				System.out.println("Palindrom count is: " + cnt);
				break;

			case 23:
				System.out.println("Select Choice is Count 1 to 1000 Harshad number");
				System.out.print("Enter Range:");
				num1 = Scan.nextInt();
				for (i = 1; i <= num1; i++) {
					num = i;
					o_num = i;
					sum = 0;
					while (num > 0) {
						sum += num % 10;
						num = num / 10;
					}
					if (o_num % sum == 0) {
//						System.out.println(o_num);
						cnt++;
					}

				}
				System.out.println("..................................................");
				break;

			case 24:
				System.out.println("Select Choice is Count Sum of odd");
				System.out.print("Enter Range: ");
				num1 = Scan.nextInt();
				sum = 0;
				for (i = 1; i <= num1; i++) {
					if (i % 2 != 0) {
						sum += i;
					}
				}
				System.out.println("Sum of odd number: " + sum);
				System.out.println("..............................................");
				break;

			case 25:
				System.out.println("Select Choice Calculate Discount");
				System.out.print("Enter Price: ");
				float price;
				price = Scan.nextFloat();
				System.out.print("Enter Discount: ");
				float discount;
				discount = Scan.nextFloat();
				float one_per = price / 100;
				float dis = one_per * discount;
				System.out.println("Discount in money: " + dis);
				float total_dis = price - dis;
				System.out.println("Total price is: " + total_dis);
				System.out.println("........................................");

				break;

			case 26:
				System.out.println("Select Choice Find Square");
				System.out.print("Enter Number: ");
				num1 = Scan.nextInt();
				int square = num1 * num1;
				System.out.println("Square is: " + square);
				System.out.println(".........................................");
				break;

			case 27:
				System.out.println("Select Choice Area of rectangle and perimeter");
				System.out.print("Enter Length: ");
				float length = Scan.nextFloat();
				System.out.println("Enter breadth: ");
				float breadth = Scan.nextFloat();
				float area = length * breadth;
				System.out.println("Area of rectangle is: " + area);
				float per = 1 * (length + breadth);
				System.out.println("Perimeter of Rectangle is: " + per);
				System.out.println("......................................................");

				break;

			case 28:
				System.out.println("Select Choice is Calculate Simple Interest");
				System.out.println("Enter Principle: ");
				float Principle = Scan.nextFloat();
				System.out.println("Enter Time: ");
				float Time = Scan.nextFloat();
				System.out.println("Enter Rate: ");
				float Rate = Scan.nextFloat();
				float si = Principle * Time * Rate / 100;
				System.out.println("Simple Interest: " + si);
				System.out.println("........................................");

				break;

			case 29:
				System.out.println("Select Choice is Calculate Compound Interest");
				System.out.println("Enter Principle: ");
				double P = Scan.nextDouble();
				System.out.println("Enter Time");
				int t = Scan.nextInt();
				System.out.println("Enter Rate");
				double r = Scan.nextDouble();
				System.out.println("Enter number of time apllied");
				double n = Scan.nextDouble();
				double first = 1 + r / n;
				double second = n * t;
				double CI = P * Math.pow(first, second);
				System.out.println("Compound interest is: " + CI);
				System.out.println(".....................................");
				break;

			case 30:
				System.out.println("Select Choice is Area of Circle");
				System.out.print("Enter Radius: ");
				float pi = 3.14f;
				float radius = Scan.nextFloat();
				area = pi * radius * radius;
				System.out.println("Area of Circle is: " + area);
				System.out.println("..........................................");
				break;

			case 31:
				System.out.println("Select Choice Find the cube");
				System.out.print("Enter number");
				num1 = Scan.nextInt();
				int cube = num1 * num1 * num1;
				System.out.println("Cube is: " + cube);
				System.out.println("......................................");
				break;

			case 32:
				System.out.println("Select Choice is Leap year or not");
				System.out.println("Enter Year: ");
				int Year = Scan.nextInt();
				if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
					System.out.println("Leap Year");
				} else {
					System.out.println("Not Leap Year");
				}
				break;

			case 33:
				System.out.println("Select Choice is Swap Variable");
				System.out.print("Enter num1: ");
				num1 = Scan.nextInt();
				System.out.print("Enter num1: ");
				num2 = Scan.nextInt();
				System.out.println("Before Swap");
				System.out.println(num1);
				System.out.println(num2);
				num1 = num1 + num2;
				num2 = num1 - num2;
				num1 = num1 - num2;
				System.out.println("After Swap");
				System.out.println(num1);
				System.out.println(num2);
				System.out.println("......................................");

				break;

			case 34:
				System.out.println("Select Choice is Eligiable votr or not");
				System.out.print("Enter Age: ");
				int age = Scan.nextInt();
				if (age >= 18) {
					System.out.println("Eligible Vote");
					System.out.println("........................................");
				} else {
					System.out.println("Not eligibel Vote");
					System.out.println("..........................................");

				}
				break;

			case 35:
				System.out.println("Select Choice is Profit or loss");
				System.out.print("Enter Buy Price: ");
				float Buy_price = Scan.nextFloat();
				System.out.print("Enter Selling Price: ");
				float sell_price = Scan.nextFloat();
				float loss = sell_price - Buy_price;
				if (Buy_price < sell_price) {
					if (loss > 0) {
						System.out.println("Profit is: " + loss);
					}
					System.out.println("Profit");
					System.out.println("................................");
				} else {
					if (loss < 0) {
						System.out.println("Loss is: " + loss);
					}
					System.out.println("Loss");
					System.out.println("................................");

				}

				break;
			case 36:
				System.out.println("Select Choice is Factoria num");
				System.out.print("Enter Number: ");
				num1 = Scan.nextInt();
				int fac = 1;
				for (i = 1; i <= num1; i++) {
					fac = fac * i;

				}
				System.out.println("Factorial number is: " + fac);
				System.out.println("....................................");
				break;

			case 37:
				System.out.println("Select Choice is Amstrong number");
				System.out.print("Enter Number: ");
				num1 = Scan.nextInt();
				o_num = num1;
				int arm = 0;
				while (num1 > 0) {
					int rem = num1 % 10;
					arm += rem * rem * rem;
					num1 = num1 / 10;
				}
				if (o_num == arm) {
					System.out.println("Armstrong Number");
					System.out.println("..................................");
				} else {
					System.out.println("Not Armstrong Number");
					System.out.println("........................................");
				}
				break;

			case 38:
				System.out.println("Select Choice is 1 to 1000 Armstrong print and count ");
				System.out.print("Enter Range: ");
				num1 = Scan.nextInt();
				arm = 0;
				cnt = 0;
				for (i = 1; i <= num1; i++) {
					num = i;
					o_num = i;
					arm = 0;
					while (num > 0) {
						int rem = num % 10;
						arm += rem * rem * rem;
						num = num / 10;
					}
					if (o_num == arm) {
						System.out.println(o_num);
						cnt++;
					}
				}
				System.out.println("Count is : " + cnt);
				System.out.println("...........................................");
				break;
			case 0:

				break;

			default:

				System.out
						.println("//Your choice is worng........" + "\nplease correct choice for the following menu//");

			}
		} while (ch != 0);
	}
}
