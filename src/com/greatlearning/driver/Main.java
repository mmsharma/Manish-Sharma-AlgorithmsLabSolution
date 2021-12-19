package com.greatlearning.driver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.greatlearning.service.MergeSortImplementation;

import com.greatlearning.service.NotesCount;

public class Main {

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of currency denominations ");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];

		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes, 0, notes.length - 1);
		Collections.reverse(Arrays.asList(notes));

		for (int i = 0; i < size; i++) {
			System.out.println(notes[i]);
		}
		int[] notesCounter = notesCount.notesCountImplementation(notes, amount);
		System.out.println("Your payment approach in order to give min no of notes will be \n");

		boolean found = false;
		for (int count = 0; count < notesCounter.length; count++) {

			if (notesCounter[count] > 0) {
				found = true;
				System.out.println(notes[count] + ":" + notesCounter[count]);
			}
		}
		if (!found) {
			System.out.println("Given amount cannot be paid with given denominations");
		}
		sc.close();
	}

}