package com.capgi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserRegistration userObj = new UserRegistration();

		System.out.println("Enter Email");
		String email = sc.nextLine();
		userObj.ValidateEmail(email);

	}
}