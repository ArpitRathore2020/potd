class Solution {
    int count(int[] arr, int n, int x) {
        int i;
        int j;
        int floor = -1;
        int ceil = -1;

        // Floor
        i = 0;
        j = n - 1;
        while (i <= j) {
            int mid = j + (i - j) / 2;
            if (arr[mid] == x)
                floor = mid;
            if (arr[mid] < x)
                i = mid + 1;
            else
                j = mid - 1;
        }

        i = 0;
        j = n - 1;
        while (i <= j) {
            int mid = j + (i - j) / 2;
            if (arr[mid] == x)
                ceil = mid;
            if (arr[mid] <= x)
                i = mid + 1;
            else
                j = mid - 1;
        }

        if (floor == -1 || ceil == -1)
            return 0;
        return ceil - floor + 1;
    }
}