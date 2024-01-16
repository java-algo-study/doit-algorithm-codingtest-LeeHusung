package doit_java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a002평균 {
    //1546
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> b - a);
        int m = arr[0];
        double[] newArr = new double[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = (double) arr[i] / m * 100;
        }

        double sum = 0;
        for (double x : newArr) {
            sum += x;
        }
        System.out.println(sum / n);

    }
}
