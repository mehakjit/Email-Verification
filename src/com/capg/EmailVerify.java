package com.capg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerify {
	public static void main(String[] args) {
		System.out.println("Welcome to Email validatation Program");
			Scanner sc = new Scanner(System.in);
			Pattern pincode = Pattern.compile("^abc{1,}[a-zA-Z0-9!@#$&()\\\\-`.+,/\\\"]*@bridgelab.co");
			System.out.println("Enter the email");
			String pattern = sc.nextLine();
			Matcher matcher = pincode.matcher(pattern);
			boolean isFound = matcher.find();
			if(isFound)
				System.out.println("Patter found");
			else
				System.out.println("Patter not found");
			sc.close();
		}
	}
