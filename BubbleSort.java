public class BubbleSort implements SortingAlgorithm {

	public void swap(int pos, int curr, int[] a) {
		int temp = a[pos];
		a[pos] = a[curr];
		a[curr] = temp;
	}

	public void sort(int[] a) {
		boolean swapped = true;
		int place = a.length - 1;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < place; i++) {
				if (a[i] > a[i + 1]) {
					swap(i, i + 1, a);
					swapped = true;
				}
			}
			--place;
		}
	}
}