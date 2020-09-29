package com.capgi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserRegistration userObj = new UserRegistration();

		System.out.println("Enter Phone number");
		String phoneNo = sc.nextLine();
		userObj.ValidatePhoneNo(phoneNo);

	}
}