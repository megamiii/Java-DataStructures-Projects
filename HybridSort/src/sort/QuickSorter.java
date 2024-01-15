package sort;

public class QuickSorter<K extends Comparable<? super K>>{
	public void sort(Pair<K, ?>[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivotIndex = partition(array, left, right);
		sort(array, left, pivotIndex - 1);
		sort(array, pivotIndex + 1, right);
	}
	
	public int partition(Pair<K, ?>[] array, int left, int right) {
		Pair<K, ?> pivot = array[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (array[j].getKey().compareTo(pivot.getKey()) < 0) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, right);
		return i + 1;
	}
	
	private void swap(Pair<K, ?>[] array, int i, int j) {
		Pair<K, ?> temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
