package doit_java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a017소트인사이드 {
    //1427

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] carr = input.toCharArray();

        Arrays.sort(carr);
        StringBuilder sb = new StringBuilder(new String(carr));
        String answer = sb.reverse().toString();
        System.out.println(answer);

    }
}
