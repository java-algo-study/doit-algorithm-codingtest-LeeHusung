package doit_java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class a008좋다check {
    //1253
    //2
    //0 0
    //out : 0

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 0;
        for (int k = 0; k < n; k++) {
            int x = arr[k];
            int i = 0, j = n - 1;
            while (i < j) {
                if (i == k) {
                    i++;
                    continue;
                }
                if (j == k) {
                    j--;
                    continue;
                }
                if (arr[i] + arr[j] == x) {
                    answer++;
                    break;
                } else if (arr[i] + arr[j] < x) {
                    i++;
                } else j--;
            }
        }
        System.out.println(answer);

        //67퍼틀
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (set.contains(arr[i] + arr[j])) continue;
//                set.add(arr[i] + arr[j]);
//            }
//        }
//
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            if (set.contains(arr[i])) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
    }
}
