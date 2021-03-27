package test.search;

import java.util.Scanner;

public class IceCream2 {
    //4 5
    //00110
    //00011
    //11111
    //00000

    public static int N;
    public static int M;
    public static int[][] graph = new int[1000][1000];

    // DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
    public static boolean dfs(int x, int y) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x < 0 || x >= N || y < 0 || y >= M) {
            return false;
        }

        // 현재 노드를 방문하지 않았다면
        if (graph[x][y] == 0) {
            // 해당 노드 방문처리
            graph[x][y] = 1;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // N, M을 공백을 기준으로 구분하여 입력받기
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();  // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        int result = 0;
        graph = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // 모든 노드(위치)에 대하여 음료수 채우기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 현재 위치에서 DFS 수행
                if (dfs(i, j)) {
                    result += 1;
                };
            }
        }

        System.out.println(result); //  정답 출력
    }

}
