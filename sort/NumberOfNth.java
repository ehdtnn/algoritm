package test.sort;

public class NumberOfNth {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];

        for (int c = 0; c < commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];

            int[] checker = new int[100];
            int start = i - 1;
            int end = j;
            for (int a = start; a < end; a++) {
                //System.out.println("a:" + a);
                int idx = array[a];
                checker[idx]++;
            }

            // for (int x=0; x<100; x++) {
            //     System.out.print(checker[x]);
            // }
            // System.out.println("");

            int sum = 0;
            int idx = 0;
            while (sum < k) {
                sum += checker[idx];
                idx++;
            }
            answer[c] = idx - 1;

        }
        return answer;
    }
}
