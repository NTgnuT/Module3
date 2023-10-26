package BT.baitap3;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println(System.currentTimeMillis());
        // in 100 so nguyen to dau tien
        int count = 0; // dem so luong so nguyen to
        int i = 2; // tim so nguyen to bat dau tu 2
        while (count < 100) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
        System.out.println(System.currentTimeMillis());
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n<2 khong phai so nguyen to
        if (n < 2) {
            return false;
        }

        // check so nguyen to khi n > 2
        for (int i = 0; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
