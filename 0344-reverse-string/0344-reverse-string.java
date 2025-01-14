class Solution {
    public void reverseString(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            char t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
    }
}