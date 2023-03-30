class p2{
    public static void main(String[] args) {
// Hollow butterfly

        int n=10;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n; j++) {
                // condition to print *
                if (j==1 || j==n ||i==j || j==n-i+1) {
                    System.out.print("*");
                }
                // white spaces
                else System.out.print(" ");
            }
            // new line
            System.out.println();
        }
    }
}
