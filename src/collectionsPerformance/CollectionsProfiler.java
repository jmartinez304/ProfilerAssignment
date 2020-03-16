package collectionsPerformance;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

/**
 * 
 * This program was made to verify the relative performance of adding and
 * deleting random integers by each of the following collection classes:
 * ArrayList, LinkedList, HashTable. To measure the performance of each
 * collection one can use VisualVM and JProfiler.
 *
 */

public class CollectionsProfiler {

	/**
	 * Main class that calls each of the collection methods and define how many
	 * random integers are going to be added and deleting by the collections.
	 * 
	 * @param args an array of command-line arguments for the application
	 */

	public static void main(String[] args) {

		int numberOfIntegers = 2000000;

		arrayListMethod(numberOfIntegers);
		linkedListMethod(numberOfIntegers);
		hastableMethod(numberOfIntegers);

	}

	/**
	 * Method to create, add and delete random integers in an ArrayList.
	 * 
	 * @param numberOfIntegers number of random integers to be used by the ArrayList
	 */
	public static void arrayListMethod(int numberOfIntegers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();

		for (int i = 0; i < numberOfIntegers; i++) {
			list.add(rand.nextInt(numberOfIntegers));
		}

		for (int i = 0; i < numberOfIntegers; i++) {
			list.remove(0);
		}
	}

	/**
	 * Method to create, add and delete random integers in an LinkedList.
	 * 
	 * @param numberOfIntegers number of random integers to be used by the
	 *                         LinkedList
	 */
	public static void linkedListMethod(int numberOfIntegers) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Random rand = new Random();

		for (int i = 0; i < numberOfIntegers; i++) {
			list.add(rand.nextInt(numberOfIntegers));
		}

		for (int i = 0; i < numberOfIntegers; i++) {
			list.remove(0);
		}

	}

	/**
	 * Method to create, add and delete random integers in an Hashtable.
	 * 
	 * @param numberOfIntegers number of random integers to be used by the Hashtable
	 */
	public static void hastableMethod(int numberOfIntegers) {

		Hashtable<Integer, Integer> table = new Hashtable<>();
		Random rand = new Random();

		for (int i = 0; i < numberOfIntegers; i++) {
			table.put(i, rand.nextInt(numberOfIntegers));
		}

		for (int i = 0; i < numberOfIntegers; i++) {
			table.remove(i);
		}

	}

}
