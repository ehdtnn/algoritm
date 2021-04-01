package test.sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

// 최대 K번 교체 가능, A의 모든 원소의 합의 최댓값 출력
public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N, K 입력
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // 배열 A 입력
        Integer[] a = new Integer [n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // 배열 B 입력
        Integer[] b = new Integer [n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        // 배열 A 오름차순 정렬
        Arrays.sort(a);
        // 배열 B 내림차순 정렬
        Arrays.sort(b, Collections.reverseOrder());

        // 첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 K번 비
        for (int i = 0; i < k; i++) {
            if (a[i] < b[i]) {
                // 교체
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            } else {
                // A의 원소가 B의 원소보다 크거가 같으면 반복문 탈출
                break;
            }
        }

        // A의 모든 원소의 합의 최댓값
        int sum = 0;
        for (int i = 0; i < n; i ++) {
            sum += a[i];
        }
        System.out.println("sum of A : " + sum);
    }
}
