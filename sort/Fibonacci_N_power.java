package test.sort;

public class Fibonacci_N_power {

    // 비효율적 방법 (지수 시간 복잡도 2의 N제곱)
    // 피보나치 함수(Fibonacci Function)을 재귀함수로 구현
    // fibo(30) => 1024 * 1024 * 1024

    public static int fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibo(x - 1) + fibo(x - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}
