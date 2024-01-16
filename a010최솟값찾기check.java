package doit_java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class a010최솟값찾기check {
    //11003

    //N과 L 모두 범위가 5000000까지. 시간복잡도 고려
    static class Node {
        int idx;
        int value;

        public Node(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int L = Integer.parseInt(s[1]);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        LinkedList<Node> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

            //value 순서로 정렬 (sort 안쓰고 덱으로 정렬하는 법)
            while (!list.isEmpty() && list.peekLast().value > A[i]) {
                list.removeLast();
            }

            list.add(new Node(i, A[i]));

            //범위 조절
            if (list.peekFirst().idx <= i - L) {
                list.removeFirst();
            }
            sb.append(list.peekFirst().value).append(" ");
        }
        System.out.println(sb.toString());

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 1; i < A.length; i++) {
//            if (i <= L) {
//                pq.offer(A[i]);
//                list.add(A[i]);
//            }
//            if (i > L) {
//                list.add(A[i]);
//                Integer poll = list.pollFirst();
//                pq.remove(poll);
//                pq.offer(A[i]);
//            }
//            if (!pq.isEmpty()) D[i] = pq.peek();
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i < D.length; i++) {
//            sb.append(D[i]).append(" ");
//        }
//        System.out.println(sb);


    }
}
