public class SelectionSort implements SortingAlgorithm {

	public int find_min(int pos, int[] a) {
		int min = pos;
		for (int k = pos + 1; k < a.length; k++) {
			if (a[k] < a[min])
				min = k;
		}
		return min;
	}

	public void swap(int pos, int curr, int[] a) {
		int temp = a[pos];
		a[pos] = a[curr];
		a[curr] = temp;
	}

	public void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			swap(i, find_min(i,a), a);
		// 	for (int x: a) {
		// 		System.out.println(x);
		// 	}
		}
	}
}