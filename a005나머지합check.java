package doit_java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class a005나머지합check {
    //10986

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long answer = 0;
        long[] sum = new long[n + 1];
        long[] rest = new long[(int)m];
        for (int i = 1; i <= n; i++) {
            long num = Long.parseLong(st.nextToken());
            sum[i] = sum[i-1] + num;
            if (sum[i] % m == 0) answer++;
            rest[(int) (sum[i] % m)] += 1;
        }

        for (int i = 0; i < m; i++) {
            answer += rest[i] * (rest[i] - 1) / 2;
        }
        System.out.println(answer);
//        int answer = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            if (sum.get(i) % m == 0 && map.containsKey(sum.get(i) % m)) {
//                map.put(sum.get(i) % m, map.get(sum.get(i) % m) + map.get(sum.get(i) % m) + 1);
//                continue;
//            }
//            if (sum.get(i) % m == 0) {
//                map.put(sum.get(i) % m, map.getOrDefault(sum.get(i) % m, 0) + 1);
//                continue;
//            }
//            if (map.containsKey(sum.get(i) % m)) {
//                answer++;
//                continue;
//            }
//
//            map.put(sum.get(i), map.getOrDefault(sum.get(i), 0) + 1);
//        }
//
//        answer += map.get(0);
//        System.out.println(answer - 1);
    }
}
