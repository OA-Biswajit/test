public class odd {
    
        public static void main(String[] args) {
            int number1 = 33;
            int number2 = 24;
    
            System.out.println(number1 + " is odd: " + isOdd(number1));
            System.out.println(number2 + " is odd: " + isOdd(number2));
        }
    
        public static boolean isOdd(int n) {
            return ((n & 1) == 1);
        
    }
    
}
