// Problem 278: First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */



public class Problem_278 extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                right = mid; // The first bad version is at mid or before
            } else {
                left = mid + 1; // The first bad version is after mid
            }
        }
        
        return left; // left should point to the first bad version
    }   
}