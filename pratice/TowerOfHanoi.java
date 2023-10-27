import java.util.Scanner;

public class TowerOfHanoi {

    private static long count = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int from = 1;
        int helper = 2;
        int to = 3;
        solve(n, from, to, helper);
        System.out.println(count);

    }

    private static void solve(int n, int from, int to, int helper) {
        // Base condition
        if (n==1) {
            System.out.println(from + " " + to);
            count++;
            return;
        }

        // Hypothesis
        solve(n-1, from, helper, to);
        System.out.println(from + " " + to);
        count++;

        // Induction
        solve(n-1, helper, to, from);
    }
}
