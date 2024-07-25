package pkg3.dto;

import java.util.Scanner;

// 인터페이스 상속 키워드 : implements (구현하다)

public class LSJCalculator implements Calculator{
	Scanner sc = new Scanner(System.in);
	
//	public int multi(int a, int b) {
//		int result = a * b;
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if(a < num1 && a < num2) {
//			System.out.println("수를 입력 해 주세요 : " + num1);
//			return a;
//		} else if (b < num1 && b < num2) {
//			System.out.println("수를 입력 해 주세요 : " + num2);
//			return b;
//		} else { result = num1 * num2; }
//		return result;
//	}

	@Override
	public int plus(int a, int b) {
		int result = a + b;
		if(result > MAX_NUM) {
			return MAX_NUM;
		} else if (result < MIN_NUM) {
			return MIN_NUM;
		}
		return result;
	}

	@Override
	public int minus(int a, int b) {
		int result = a - b;
		if(result > MAX_NUM) {
			return MAX_NUM;
		} else if(result < MIN_NUM) {
			return MIN_NUM;
		} return result; }

	@Override
	public int multi(int a, int b) {
		int result = a * b;
		if(result > MAX_NUM) {
			return MAX_NUM;
		} else if(result < MIN_NUM) {
			return MIN_NUM;
		} return result; }
	
	@Override
	public int div(int a, int b) {
		int result = a / b;
		if(result > MAX_NUM) {
			return MAX_NUM;
		} else if(result < MIN_NUM) {
			return MIN_NUM;
		} return result; }

	@Override
	public int mod(int a, int b) {
		int result = a % b;
		if(result > MAX_NUM) {
			return MAX_NUM;
		} else if(result < MIN_NUM) {
			return MIN_NUM;
		} return result; }
	
	@Override
	public int pow(int a, int x) {
		// 거듭 제곱
		
		int result = 1;
		for(int i=0 ; i<x ; i++) {
			result *= a;
		} return result; }

	@Override
	public double areaOfCircle(double r) {
		return Calculator.PI * r * r;
	}

	// 2진수
	@Override
	public String toBinary(int num) {
		int a = num;
			String BinaryString = Integer.toBinaryString(a);
			System.out.println(Integer.toString(num, 2));
			return BinaryString;
	}
	
	// 10진수
	@Override
	public String toHexadecimal(int num) {
		int a = num;
		String hexString = Integer.toHexString(a);
		System.out.println(Integer.toString(num, 16));
		return hexString;
	}
}

