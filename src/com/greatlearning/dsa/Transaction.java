package com.greatlearning.dsa;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");

		int arraySize = sc.nextInt();

		System.out.println("Enter the values of array");

		int[] transactionArray = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			transactionArray[i] = sc.nextInt();
		}

		System.out.println("Enter the total no. of targets needed to be achieved");

		int targetSize = sc.nextInt();

		for (int count = 0; count < targetSize; count++) {

			System.out.println("Enter the value of target");

			long target = sc.nextLong();
			int numberOfTransactions = getRequiredTransactions(transactionArray, target);

			if (numberOfTransactions > 0) {
				System.out.println("Target achieved after " + numberOfTransactions + " transaction");
			} else {
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();
	}

	private static int getRequiredTransactions(int[] transactionArray, long target) {

		long transactionSum = 0;
		int numberOfTransactions = 0;
		boolean found = false;

		for (int count = 0; count < transactionArray.length; count++) {

			transactionSum += transactionArray[count];

			if (transactionSum >= target) {
				numberOfTransactions = count;
				found = true;
				break;
			}
		}
		return found ? numberOfTransactions + 1 : numberOfTransactions;
	}
}
