package com.capgi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean ValidateFirstName(String fName) {
		Pattern pattern = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Matcher matcher = pattern.matcher(fName);
		boolean isValid = matcher.find();
		if (isValid) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first name");
		String fName = sc.nextLine();
		if (ValidateFirstName(fName)) {
			System.out.println("Name is valid");

		} else {
			System.out.println("Name is invalid");
		}

	}
}