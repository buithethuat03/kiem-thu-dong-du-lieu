public class Main {
    public static int sumArr(int[] arr, int n) {
        int kq = 0;
        if (n < 0) {
            return kq;
        } else {
            for (int i = 0; i < n; i++) {
                kq = kq + arr[i];
            }
        }
        return kq;
    }

    public static void main (String[] args) {

    }
}
