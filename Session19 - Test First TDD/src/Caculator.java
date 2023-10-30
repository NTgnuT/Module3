import org.junit.function.ThrowingRunnable;

public class Caculator implements ThrowingRunnable {
    public double add(double a, double b) {
        return a + b;
    }

    public double multiply (double a, double b) {
        return a * b;
    }

    public double divide (double a, double b) {
        return a / b;
    }

    public int divineInt (int a, int b){
        return  a / b;
    }

    @Override
    public void run() throws Throwable{
        divineInt(1, 0);
    }

    public static void main(String[] args) {
        Caculator caculator = new Caculator();
        double a = caculator.divineInt(1, 0);

    }
}
