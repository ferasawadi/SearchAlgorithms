package com.yafatek;import java.util.logging.Logger;public class SearchAlgorithmsTest {	private static Logger logger = Logger.getLogger(SearchAlgorithmsTest.class.getName());	public static void main(String[] args) {		// TODO		//  data structures		//  algorithms		/**		 * Dec 19, 2019 9:49:16 AM com.yafatek.SearchAlgorithmsTest main		 * INFO: Linear Search, Element Found at index: 3		 * Dec 19, 2019 9:49:16 AM com.yafatek.SearchAlgorithmsTest main		 * INFO: found at index: 3		 * Dec 19, 2019 9:49:16 AM com.yafatek.SearchAlgorithmsTest main		 * INFO: Element Found at Index: 3		 */		int[] arr = {3, 22, 27, 47, 57, 67, 89, 91, 95, 99};		int elementToSearch = 47;		int result = linearSearch(arr, elementToSearch);		logger.info(result == -1 ? "Element Not Found In Array" : "Linear Search, Element Found at index: " + result);		// Binary Search., iterative.		int binarySearchRes = binarySearch(arr, elementToSearch);		logger.info(binarySearchRes == -1 ? "Element Not found!" : "found at index: " + binarySearchRes);		// Binary Search recursive.		int binarySearchRecursive = recursiveSearch(arr, 0, arr.length - 1, elementToSearch);		logger.info(binarySearchRecursive == -1 ? " Not Found" : "Element Found at Index: " + binarySearchRecursive);	}	/**	 * @param array          array to Search	 * @param numberToSearch element to search for	 * @return the index or -1 in case of Not Found	 */	private static int linearSearch(int[] array, int numberToSearch) {		for (int i = 0; i <= array.length - 1; i++) {			if (array[i] == numberToSearch) {				return i;			}		}		return -1;	}	/**	 * @param array           array to Search	 * @param elementToSearch element to search for	 * @return the index or -1 in case of Not Found	 */	private static int binarySearch(int[] array, int elementToSearch) {		int first = 0;		int lastIndex = array.length - 1;		while (first <= lastIndex) {			int middle = (first + lastIndex) / 2;			if (array[middle] == elementToSearch) {				return middle;			} else if (array[middle] < elementToSearch) {				first = middle + 1;			} else if (array[middle] > elementToSearch) {				lastIndex = middle - 1;			}		}		return -1;	}	/**	 * @param array           array to Search	 * @param first           first index	 * @param last            last index	 * @param elementToSearch element to search for	 * @return the index or -1 in case of Not Found	 */	private static int recursiveSearch(int[] array, int first, int last, int elementToSearch) {		if (last >= first) {			int mid = first + (last - first) / 2;			if (array[mid] == elementToSearch) return mid;			if (array[mid] > elementToSearch) {				return recursiveSearch(array, first, mid - 1, elementToSearch);			}			return recursiveSearch(array, mid + 1, last, elementToSearch);		}		return -1;	}}