/**
     * SumOfDigit in a String
     */
package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfDigitString
{
	public static void main(String []args)
	{
		test("1d-1f11a8fhks-5jkdalkdah90t-81hhf");
	}

	private static void test(String s1)
	{
		Pattern p1 = Pattern.compile("\\d+");
		Pattern p2 = Pattern.compile("-\\d+");
		Matcher m1 = p1.matcher(s1);
		int sump_ = 0;
		Matcher m2 = p2.matcher(s1);
		int sum_ = 0;
		int fsum = 0;
		while (m1.find())
		{
			sump_ = sump_ + Integer.parseInt(m1.group());
		}
		System.out.println(sump_);
		while (m2.find())
		{
			sum_ = sum_ + Integer.parseInt(m2.group());

		}
		System.out.println(sum_);
		fsum = sump_ + 2*sum_;

		System.out.println(fsum);
	}
}
