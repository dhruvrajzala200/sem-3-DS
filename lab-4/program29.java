// Chef and Hamming Distance of arrays
// Chef likes to work with arrays a lot. Today he has an array A of length N consisting of positive integers. Chef's little brother likes to follow his elder brother, so he thought of creating an array B of length N. The little brother is too small to think of new numbers himself, so he decided to use all the elements of array A to create the array B. In other words, array B is obtained by shuffling the elements of array A.

// The little brother doesn't want Chef to know that he has copied the elements of his array A. Therefore, he wants to create the array B in such a way that the Hamming distance between the two arrays A and B is maximized. The Hamming distance between A and B is the number of indices i (1 ≤ i ≤ N) such that Ai ≠ Bi.

// The brother needs your help in finding any such array B. Can you please find one such array for him?

// Note that it's guaranteed that no element in A appears more than twice, i.e. frequency of each element is at most 2.

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains an integer N denoting the length of the array A.
// The second line contains N space-separated integers A1, A2 ... AN.
// Output
// For each test case, print two lines.
// The first line should contain the maximum possible Hamming distance that array B can have from array A.
// The second line should contain N space-separated integers denoting the array B; the i-th integer should denote the value of Bi. Note that B should be an array obtained after shuffling the elements of A.
// Constraints
// 1 ≤ T ≤ 10
// 1 ≤ N ≤ 105
// 1 ≤ Ai ≤ 105
// The frequency of each integer in the array A will be at most 2.
// Subtasks
// Subtask #1 (30 points): all elements in the array A are unique

// Subtask #2 (30 points): 5 ≤ N ≤ 105

// Subtask #3 (40 points): original constraints




import java.util.*;
import java.lang.*;
import java.io.*;

public class program29 {
    class Codechef {

        public static void main(String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            for (int t = 0; t < T; t++) {
                int N = sc.nextInt();
                int M = N;
                int a[] = new int[N];

                int i = 0;
                int k = 0;
                int temp;

                for (int j = 0; j < N; j++) {
                    a[j] = sc.nextInt();
                }

                int b[] = Arrays.copyOf(a, N);
                if (N > 1) {
                    while (N > i) {
                        if (i == N - 1) {
                            k = 0;
                            if (b[i] == b[k]) {
                                k++;
                            }
                            temp = b[i];
                            b[i] = b[k];
                            b[k] = temp;
                            break;
                        }
                        if (b[i] == b[i + 1]) {
                            k = N - 1;
                            if (b[i] == b[k] && i > 0) {
                                k = i - 1;
                            }
                            temp = b[i];
                            b[i] = b[k];
                            b[k] = temp;
                            i++;
                            N--;
                        } else {
                            temp = b[i];
                            b[i] = b[i + 1];
                            b[i + 1] = temp;
                            i += 2;
                        }
                    }
                }
                int hammingDistance = 0;
                for (int j = 0; j < M; j++) {
                    if (a[j] != b[j]) {
                        hammingDistance++;
                    }
                }
                System.out.println(hammingDistance);
                for (int j = 0; j < M; j++) {
                    System.out.print(b[j] + (j < M - 1 ? " " : "\n"));
                }
            }
        }

    }
}
