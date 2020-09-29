package com.capgi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public void ValidateFirstName(String fName) {
		Pattern pattern = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Matcher matcher = pattern.matcher(fName);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println("Name is valid");
			;
		} else {
			System.out.println("Name is invalid");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserRegistration userObj = new UserRegistration();

		System.out.println("Enter the First name");
		String fName = sc.nextLine();
		userObj.ValidateFirstName(fName);

	}
}