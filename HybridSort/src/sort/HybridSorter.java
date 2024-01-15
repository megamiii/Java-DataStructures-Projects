package sort;


import java.lang.reflect.Array;

// Sort the elements in given array from `left` to `right in lexicographic order using the hybrid sorting algorithm.
public class HybridSorter<K extends Comparable<? super K>> {
	InsertionSorter<K> insertionSort = new InsertionSorter<K>();
	QuickSorter<K> quickSort = new QuickSorter<K>();
	private final int RUN = 32;

	public Pair<K, ?> search(Pair<K,?>[] array, int k) {
		// Fill your code to find k-th element in `array`.
		Pair<K, ?> kthElement = array[k-1];
		int len = array.length;
		sort(array, 0, len-1);
		return kthElement;
	}
	
	public Integer searchKey(Pair<K,?>[] array, String key) {
		// Find the value of k for the pair that has the given key as its key value.
		// k represents the k-th element in the sorted `array
		int len = array.length;
		int k = 0;

		sort(array, 0, len-1);

		while(k <= len) {
			int n = (k + len) / 2;
			int comp = key.compareTo(array[n].getKey().toString());
			if(comp == 0) {
				return n + 1;
			}
			else if (comp > 0) {
				k = n + 1;
			}
			else {
				len = n - 1;
			}
		}
		return -1;
	}

	public void sort(Pair<K, ?>[] array, int left, int right) {
		// Sort the elements in `array
		if ((right - left) <= RUN + 1){
            insertionSort.sort(array, left, right);
        }
        else {
            int pivot = quickSort.partition(array, left, right);
			sort(array, left, pivot - 1);
			sort(array, pivot + 1, right);
        }
	}

	public Pair<K, ?> first(Pair<K,?>[] array1, Pair<K,?>[] array2){
		// Find the first element
		Pair<K, ?>[] array3 = mergeArrays(array1, array2);
		return array3[0];
	}

	public Pair<K, ?> median(Pair<K,?>[] array1, Pair<K,?>[] array2){
		// Find median element
		Pair<K, ?>[] array3 = mergeArrays(array1, array2);
		int len = array3.length;
		
		if (len % 2 == 0) {
			Pair<K, ?> medianPair1 = array3[len/2-1];
			Pair<K, ?> medianPair2 = array3[len/2];
			K medianKey = (K) (medianPair1.getKey().toString() + "-" + medianPair2.getKey().toString());;
			String medianValue = medianPair1.getValue().toString() + "-" + medianPair2.getValue().toString();
			return new Pair<K, String>(medianKey, medianValue);
		} else {
			return array3[len/2];
		}
	}

	public Pair<K, ?> last(Pair<K,?>[] array1, Pair<K,?>[] array2){
		// Find the last element
		Pair<K, ?>[] array3 = mergeArrays(array1, array2);
		int len = array3.length;
		return array3[len-1];
	}

	public int min(int a, int b) {
		int res = 0;
		
		if (a > b ) res = b;
		else res = a;
		
		return res;
	}

	public Pair<K, ?>[] mergeArrays(Pair<K, ?>[] array1, Pair<K, ?>[] array2){
        int len1 = array1.length;
		int len2 = array2.length;
		int len3 = len1 + len2;

		Pair<K, ?>[] array3 = (Pair<K, ?>[]) Array.newInstance(array1[0].getClass(), len1 + len2);
		System.arraycopy(array1, 0, array3, 0, len1);
		System.arraycopy(array2, 0, array3, len1, len2);

		sort(array3, 0, len3 - 1);
		return array3;
    }
}
