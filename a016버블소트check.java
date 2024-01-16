package doit_java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a016버블소트check {
    //1377

    //버블소트는 시간복잡도가 O(n2)
    //n은 500,000까지임
    //즉 그대로 구현하면 시간초과 무조건 남

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Point(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].index - i) {
                max = arr[i].index - i;
            }
        }
        System.out.println(max + 1);
//        boolean changed = false;
//        for (int i = 1; i <= n + 1; i++) {
//            changed = false;
//            for (int j = 1; j <= n - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    changed = true;
//                    int k = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = k;
//                }
//            }
//            if (!changed) {
//                System.out.println(i);
//                break;
//            }
//        }

        
    }
    static class Point implements Comparable<Point> {
        int value;
        int index;

        public Point(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Point o) {
            return this.value - o.value;
        }
    }
}
