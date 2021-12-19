package com.greatlearning.service;

public class NotesCount {

	public int[] notesCountImplementation(int[] notes, int amount) {

		int[] notesCounter = new int[notes.length];

		int totalNumberOfNotes = 0;
		try {

			for (int i = 0; i < notes.length; i++) {
				int numberOfNotes = (int) amount / notes[i];
				notesCounter[i] = numberOfNotes;
				totalNumberOfNotes += numberOfNotes;
				amount -= (numberOfNotes * notes[i]);

				if (amount <= 0) {
					// System.out.println("Minimum number of notes required: " +
					// totalNumberOfNotes);
					break;
				}
			}
		} catch (ArithmeticException exception) {
			System.out.println("Division by zero encountered");
		}

		return notesCounter;
	}

}
