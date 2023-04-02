import java.util.Scanner;

public class L13_stringbuilder {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        // character at index
        sb.charAt(0);
        System.out.println(sb);
   
        // replace acharacter at index
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert method
        sb.insert(2, 'n');
        System.out.println(sb);




        
    }
}