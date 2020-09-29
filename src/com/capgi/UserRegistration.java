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

	public void ValidateLastName(String lName) {
		Pattern pattern = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Matcher matcher = pattern.matcher(lName);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println("Name is valid");
			;
		} else {
			System.out.println("Name is invalid");

		}
	}

	public void ValidateEmail(String email) {
		Pattern pattern = Pattern
				.compile("(^([a-z]+)([+._-]{0,1})([0-9a-z]*)([@]{1})([a-z0-9]+)(.([a-z]{2,})){1}(.[a-z][a-z])?$)");
		Matcher matcher = pattern.matcher(email);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println("email is valid");
			;
		} else {
			System.out.println("email is invalid");

		}

	}

	public void ValidatePhoneNo(String phoneNo) {
		Pattern pattern = Pattern.compile("(^([0-9]+)( )([1-9]{1})([0-9]{9})$)");
		Matcher matcher = pattern.matcher(phoneNo);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println("Number is valid");
			;
		} else {
			System.out.println("Number is invalid");

		}
	}

	public void ValidatePassword(String password) {
		Pattern pattern = Pattern.compile("(^\\S{8,}$)");
		Matcher matcher = pattern.matcher(password);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println("Password is valid");
			;
		} else {
			System.out.println("Password is invalid");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserRegistration userObj = new UserRegistration();

		System.out.println("Enter Password");
		String password = sc.nextLine();
		userObj.ValidatePassword(password);

	}
}