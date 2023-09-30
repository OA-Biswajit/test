import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main1 {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
 int b=sc.nextInt();
  int c=sc.nextInt();
if(a==b && b==c && a==c){
    System.out.println("Equilateral");
}
else if(a==b || b==c || a==c ){
     System.out.println("Isosceles");
}
else {
    System.out.println("Scalene");
}
    }
}