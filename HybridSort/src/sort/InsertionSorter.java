package sort;

// Sort the elements in given array from `left` to `right` in lexicographical order using insertion sort algorithm.
public class InsertionSorter<K extends Comparable<? super K>> {
	
	public void sort(Pair<K, ?>[] array, int left, int right) {
		// Fill your code to sort the elements in `array`.
		for (int i = left + 1; i <= right; i++) {
			Pair<K, ?> current = array[i];
			int j = i - 1;
			while (j >= left && current.getKey().compareTo(array[j].getKey()) < 0) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;
		}

	}
		
}