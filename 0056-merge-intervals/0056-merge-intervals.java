class Solution {
    public int[][] merge(int[][]arr) {
       int n = arr.length; 
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> ansList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (ansList.isEmpty() || arr[i][0] > ansList.get(ansList.size() - 1)[1]) {
                ansList.add(new int[]{arr[i][0], arr[i][1]});
            }
            else {
                ansList.get(ansList.size() - 1)[1] = Math.max(ansList.get(ansList.size() - 1)[1], arr[i][1]);
            }
        }
        int[][] ans = new int[ansList.size()][2];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}