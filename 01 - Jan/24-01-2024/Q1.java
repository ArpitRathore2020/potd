
/*
165. Compare Version Numbers
    Problem Description:
        Given two version numbers, `version1` and `version2`, compare them.
        Version numbers consist of one or more revisions joined by a dot '.'. Each revision consists of digits and may contain leading zeros. Every revision contains at least one character. Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example, `2.5.33` and `0.1` are valid version numbers.
        To compare version numbers, compare their revisions in left-to-right order. Revisions are compared using their integer value ignoring any leading zeros. This means that revisions `1` and `001` are considered equal. If a version number does not specify a revision at an index, then treat the revision as `0`. For example, version `1.0` is less than version `1.1` because their revision `0`s are the same, but their revision `1`s are `0` and `1` respectively, and `0 < 1`.

    Return the following:
        - If `version1 < version2`, return -1.
        - If `version1 > version2`, return 1.
        - Otherwise, return 0.

Examples:
    1. 
        - Input: `version1 = "1.01", version2 = "1.001"`
        - Output: `0`
        - Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".
    2. 
        - Input: `version1 = "1.0", version2 = "1.0.0"`
        - Output: `0`
        - Explanation: version1 does not specify revision 2, which means it is treated as "0".
    3. 
        - Input: `version1 = "0.1", version2 = "1.1"`
        - Output: `-1`
        - Explanation: version1's revision 0 is "0", while version2's revision 0 is "1". `0 < 1`, so `version1 < version2`.

Constraints:
    - `1 <= version1.length, version2.length <= 500`
    - `version1` and `version2` only contain digits and '.'.
    - `version1` and `version2` are valid version numbers.
    - All the given revisions in `version1` and `version2` can be stored in a 32-bit integer.

*/
import java.util.*;

class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;
        int n1 = version1.length();
        int n2 = version2.length();
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (i < n1) {
            while (i < n1 && version1.charAt(i) != '.') {
                s1.append(version1.substring(i, i + 1));
                i++;
            }
            list1.add(Integer.valueOf(s1.toString()));
            s1 = new StringBuilder("");
            i++;

        }
        while (j < n2) {
            while (j < n2 && version2.charAt(j) != '.') {
                s2.append(version2.substring(j, j + 1));
                j++;
            }
            list2.add(Integer.valueOf(s2.toString()));
            s2 = new StringBuilder("");
            j++;
        }
        for (i = 0; i < Math.min(list1.size(), list2.size()); i++) {
            if (list1.get(i) < list2.get(i))
                return -1;
            if (list1.get(i) > list2.get(i))
                return 1;
        }
        for (i = Math.min(list1.size(), list2.size()); i < list1.size(); i++) {
            if (list1.get(i) != 0)
                return 1;
        }
        for (i = Math.min(list1.size(), list2.size()); i < list2.size(); i++) {
            if (list2.get(i) != 0)
                return -1;
        }
        return 0;
    }
}