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

        // delete method
        sb.delete(2, 3);
        System.out.println(sb);

        StringBuilder sb2=new StringBuilder("h");

        // append method
        sb2.append('e');
        sb2.append('l');
        sb2.append('l');
        sb2.append('o');
        sb2.append('\t');
        sb2.append("yep");
        System.out.println(sb2);
        
        // length() method
        System.out.println(sb.length());
        System.out.println(sb2.length());





        
    }
}