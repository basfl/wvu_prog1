package com.generic.arithmetic;

import java.util.HashMap;
import java.util.Map;

public class Arithmetic {
	public String addition(String num1, String num2) {
		Integer add;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {
			System.out.println("\n *****binary");
			add = convertBinarytoInteger(num1) + convertBinarytoInteger(num2);
			System.out.println(
					"add->" + convertBinarytoInteger(num1) + " + " + convertBinarytoInteger(num2) + " = " + add);
			return (Integer.toBinaryString(add));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {
			System.out.println("hexa");
			add = convertHexaToIneger(num1) + convertHexaToIneger(num2);
			System.out.println("add->" + convertHexaToIneger(num1) + " + " + convertHexaToIneger(num2) + " = " + add);
			return (Integer.toHexString(add));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {
			System.out.println("octal");
			add = convertOctalToInteger(num1) + convertOctalToInteger(num2);
			System.out
					.println("add->" + convertOctalToInteger(num1) + " + " + convertOctalToInteger(num2) + " = " + add);
			return (Integer.toOctalString(add));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\+|-)?([.0-9]+)")) {
			System.out.println("decimal");
			add = convertStringToInteger(num1) + convertStringToInteger(num2);
			System.out.println(
					"add->" + convertStringToInteger(num1) + " + " + convertStringToInteger(num2) + " = " + add);
			return (add.toString());

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public String subtraction(String num1, String num2) {
		Integer sub;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {
			System.out.println("\n *****binary");
			sub = convertBinarytoInteger(num1) - convertBinarytoInteger(num2);
			System.out.println(
					"sub->" + convertBinarytoInteger(num1) + " - " + convertBinarytoInteger(num2) + " = " + sub);
			return (Integer.toBinaryString(sub));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {
			System.out.println("hexa");
			sub = convertHexaToIneger(num1) - convertHexaToIneger(num2);
			System.out.println("sub->" + convertHexaToIneger(num1) + " - " + convertHexaToIneger(num2) + " = " + sub);
			return (Integer.toHexString(sub));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {
			System.out.println("octal");
			sub = convertOctalToInteger(num1) - convertOctalToInteger(num2);
			System.out
					.println("sub->" + convertOctalToInteger(num1) + " - " + convertOctalToInteger(num2) + " = " + sub);
			return (Integer.toOctalString(sub));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\+|-)?([.0-9]+)")) {
			System.out.println("decimal");
			sub = convertStringToInteger(num1) - convertStringToInteger(num2);
			System.out.println(
					"sub->" + convertStringToInteger(num1) + " - " + convertStringToInteger(num2) + " = " + sub);
			return (sub.toString());

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public String multiplication(String num1, String num2) {
		Integer mul;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {
			System.out.println("\n *****binary");
			mul = convertBinarytoInteger(num1) * convertBinarytoInteger(num2);
			System.out.println(
					"mul->" + convertBinarytoInteger(num1) + " * " + convertBinarytoInteger(num2) + " = " + mul);
			return (Integer.toBinaryString(mul));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {
			System.out.println("hexa");
			mul = convertHexaToIneger(num1) * convertHexaToIneger(num2);
			System.out.println("mul->" + convertHexaToIneger(num1) + " * " + convertHexaToIneger(num2) + " = " + mul);
			return (Integer.toHexString(mul));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {
			System.out.println("octal");
			mul = convertOctalToInteger(num1) * convertOctalToInteger(num2);
			System.out
					.println("mul->" + convertOctalToInteger(num1) + " * " + convertOctalToInteger(num2) + " = " + mul);
			return (Integer.toOctalString(mul));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\\\+|-)?([.0-9]+)")) {
			System.out.println("decimal");
			mul = convertStringToInteger(num1) * convertStringToInteger(num2);
			System.out.println(
					"mul->" + convertStringToInteger(num1) + " * " + convertStringToInteger(num2) + " = " + mul);
			return (mul.toString());

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public String division(String num1, String num2) {
		Integer div;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {
			System.out.println("\n *****binary");

			div = divResult(convertBinarytoInteger(num1), convertBinarytoInteger(num2));
			System.out.println(
					"div->" + convertBinarytoInteger(num1) + " / " + convertBinarytoInteger(num2) + " = " + div);
			return (Integer.toBinaryString(div));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {
			System.out.println("hexa");
			div = divResult(convertHexaToIneger(num1), convertHexaToIneger(num2));
			System.out.println("div->" + convertHexaToIneger(num1) + " / " + convertHexaToIneger(num2) + " = " + div);
			return (Integer.toHexString(div));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {
			System.out.println("octal");
			div = divResult(convertOctalToInteger(num1), convertOctalToInteger(num2));
			System.out
					.println("div->" + convertOctalToInteger(num1) + " / " + convertOctalToInteger(num2) + " = " + div);
			return (Integer.toOctalString(div));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\\\+|-)?([.0-9]+)")) {
			System.out.println("decimal");
			div = divResult(convertStringToInteger(num1), convertStringToInteger(num2));
			System.out.println(
					"div->" + convertStringToInteger(num1) + " / " + convertStringToInteger(num2) + " = " + div);
			try {
				return (div.toString());
			} catch (Exception e) {

			}

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public String power(String num1, String num2) {
		Integer power;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {
			System.out.println("\n *****binary");
			power = (int) Math.pow(convertBinarytoInteger(num1), convertBinarytoInteger(num2));
			System.out.println(
					"power->" + convertBinarytoInteger(num1) + " ^ " + convertBinarytoInteger(num2) + " = " + power);
			return (Integer.toBinaryString(power));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {
			System.out.println("hexa");
			power = (int) Math.pow(convertHexaToIneger(num1), convertHexaToIneger(num2));
			System.out
					.println("power->" + convertHexaToIneger(num1) + " ^ " + convertHexaToIneger(num2) + " = " + power);
			return (Integer.toHexString(power));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {
			System.out.println("octal");
			power = (int) Math.pow(convertOctalToInteger(num1), convertOctalToInteger(num2));
			System.out.println(
					"power->" + convertOctalToInteger(num1) + " ^ " + convertOctalToInteger(num2) + " = " + power);
			return (Integer.toOctalString(power));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\\\+|-)?([.0-9]+)")) {
			System.out.println("decimal");
			power = (int) Math.pow(convertStringToInteger(num1), convertStringToInteger(num2));
			System.out.println(
					"power->" + convertStringToInteger(num1) + " ^ " + convertStringToInteger(num2) + " = " + power);
			return (power.toString());

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public String sqrt(String num1) {
		Integer sqrt;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {
			System.out.println("\n *****binary");
			sqrt = (int) Math.sqrt(convertBinarytoInteger(num1));
			System.out.println("sqrt->" + convertBinarytoInteger(num1) + " = " + sqrt);
			return (Integer.toBinaryString(sqrt));
		} else if (num1.toLowerCase().startsWith("0x")) {
			System.out.println("hexa");
			sqrt = (int) Math.sqrt(convertHexaToIneger(num1));
			System.out.println("sqrt->" + convertHexaToIneger(num1) + " = " + sqrt);
			return (Integer.toHexString(sqrt));

		} else if (num1.toLowerCase().startsWith("0")) {
			System.out.println("octal");

			sqrt = (int) Math.sqrt(convertOctalToInteger(num1));
			System.out.println("sqrt->" + convertOctalToInteger(num1) + " = " + sqrt);
			return (Integer.toOctalString(sqrt));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)")) {
			System.out.println("decimal");

			sqrt = (int) Math.sqrt(convertStringToInteger(num1));
			System.out.println("sqrt->" + convertStringToInteger(num1) + " = " + sqrt);
			return (sqrt.toString());

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public Map<String, String> numberBaseConvertor(String num1) {
		Map<String, String> conver = new HashMap<String, String>();
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {
			System.out.println("\n *****binary");

			Integer number = convertBinarytoInteger(num1);
			conver.put("decimal", "" + number);
			conver.put("binary", num1);
			conver.put("hexadecimal", "0X" + Integer.toHexString(number));
			conver.put("octal", "0" + Integer.toOctalString(number));
			return conver;

		} else if (num1.toLowerCase().startsWith("0x")) {
			System.out.println("hexa");
			Integer number = convertHexaToIneger(num1);
			conver.put("decimal", "" + number);
			conver.put("binary", "0b" + Integer.toBinaryString(number));
			conver.put("hexadecimal", Integer.toHexString(number));
			conver.put("octal", "0" + Integer.toOctalString(number));
			return conver;

		} else if (num1.toLowerCase().startsWith("0")) {
			System.out.println("octal");

			Integer number = convertOctalToInteger(num1);
			conver.put("decimal", "" + number);
			conver.put("binary", "0b" + Integer.toBinaryString(number));
			conver.put("hexadecimal", "0X" + Integer.toHexString(number));
			conver.put("octal", Integer.toOctalString(number));
			return conver;

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)")) {
			System.out.println("decimal");
			Integer number = convertStringToInteger(num1);
			conver.put("decimal", "" + number);
			conver.put("binary", "0b" + Integer.toBinaryString(number));
			conver.put("hexadecimal", "0X" + Integer.toHexString(number));
			conver.put("octal", "0" + Integer.toOctalString(number));
			return conver;

		} else {
			System.out.println("worng format!!!");
		}
		return conver;

	}

	private Integer divResult(Integer n1, Integer n2) {
		Integer result = null;
		try {
			result = n1 / n2;
		} catch (ArithmeticException e) {
			System.out.println("can not divide by 0");
		}
		return result;

	}

	private Integer convertStringToInteger(String num) {
		return (Integer.parseInt(num.trim().intern()));

	}

	private Integer convertOctalToInteger(String num) {
		return (Integer.parseInt(num.substring(1, num.length()), 8));

	}

	private Integer convertHexaToIneger(String num) {
		return (Integer.parseInt(num.substring(2, num.length()), 16));

	}

	private Integer convertBinarytoInteger(String num) {
		return (Integer.parseInt(num.substring(2, num.length()), 2));

	}

}
