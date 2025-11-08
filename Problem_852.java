// Find the peak element in a mountain array

// binary search approach

public int peakIndexInMountainArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] < arr[mid + 1]) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}


// linear scan approach

public int peakIndexInMountainArray(int[] arr) {
    for (int i = 1; i < arr.length - 1; i++) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            return i;
        }
    }
    return -1; // This line should never be reached for a valid mountain array
}
