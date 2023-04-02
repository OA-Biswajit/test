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


// REVERSE A STRING
        StringBuilder sb3 = new StringBuilder("HelloWorld");
    
        for(int i=0; i<sb3.length()/2; i++) {
          int front = i;
          int back = sb3.length() - i - 1;
   
   
          char frontChar = sb3.charAt(front);
          char backChar = sb3.charAt(back);
   
   
          sb3.setCharAt(front, backChar);
          sb3.setCharAt(back, frontChar);
        }
   
   
        System.out.println(sb3);
   



        
    }
}