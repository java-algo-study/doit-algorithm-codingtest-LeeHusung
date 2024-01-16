package doit_java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a001숫자의합 {
    //11720
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] carr = br.readLine().toCharArray();
        int sum = 0;
        for (char ch : carr) {
            sum += Character.getNumericValue(ch);
        }
        System.out.println(sum);
    }
}
