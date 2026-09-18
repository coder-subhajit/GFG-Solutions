class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        TreeSet<Integer> set = new TreeSet<>();

        for (int n : a) {
            set.add(n);
        }

        for (int n : b) {
            set.add(n);
        }

        ArrayList<Integer> ans = new ArrayList<>(set);

        return ans;
    }
}