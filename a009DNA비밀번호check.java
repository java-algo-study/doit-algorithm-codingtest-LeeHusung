package doit_java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a009DNA비밀번호check {
    //12891
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        st = new StringTokenizer(br.readLine());
        arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] ch = new int[4];
        for (int i = 0; i < p; i++) {
            ch[add(str.charAt(i))]++;
        }
        int answer = 0;
        if (isValid(ch)) {
            answer++;
        }
        for (int i = p; i < s; i++) {
            ch[add(str.charAt(i))]++;
            ch[add(str.charAt(i-p))]--;
            if (isValid(ch)) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    private static boolean isValid(int[] ch) {
        for (int i = 0; i < 4; i++) {
            if (arr[i] > ch[i]) return false;
        }
        return true;
    }

    private static int add(char x) {
        switch (x) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
        }
        return -1;
    }
}


//        시간초과
//        int answer = 0;
//        for (int k = 0; k < str.length() - p + 1; k++) {
//            String substr = str.substring(k, k + p);
//            int a = 0, c = 0, g = 0, t = 0;
//
//            for (int i = 0; i < substr.length(); i++) {
//                if (substr.charAt(i) == 'A') a++;
//                else if (substr.charAt(i) == 'C') c++;
//                else if (substr.charAt(i) == 'G') g++;
//                else if (substr.charAt(i) == 'T') t++;
//            }
//            if (arr[0] < a || arr[1] < c || arr[2] < g || arr[3] < t) {
//                continue;
//            } else answer++;
//        }
//
//        System.out.println(answer);
