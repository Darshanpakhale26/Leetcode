// Find the peak element in a mountain array

// binary search approach

public int Problem_1095(int target, MountainArray mountainArr) {
    int left = 0;
    int right = mountainArr.length() - 1;

    // First, find the peak of the mountain array
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    int peak = left;

    // Search in the ascending part
    left = 0;
    right = peak;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int value = mountainArr.get(mid);
        if (value == target) {
            return mid;
        } else if (value < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    // Search in the descending part
    left = peak;
    right = mountainArr.length() - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int value = mountainArr.get(mid);
        if (value == target) {
            return mid;
        } else if (value > target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1; // Target not found
}
