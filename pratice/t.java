import java.util.*;
class t{
      public static void main(String[] args) {
          LinkedList<String> s = new LinkedList<>();
                    LinkedList<String> s2 = new LinkedList<>();


          s.add("aul");
          s.add("anul");
          s.add("kau");
          s.add("baya");
          s.add("adi");
          s.add("Dibyanshu");
          s.add("chota sarkar");
          System.out.println(s);
          s.addFirst("first");
          s.addLast("addlast");
          s2.addAll(0, s);
          s2.addFirst(" variable");
          System.out.println(s);
          System.out.println(s2);
           s2.addAll(s2.size(), s2);

System.out.println(s2);
LinkedList<Double> s3 = new LinkedList<>();
s3.addLast(2.0);
System.out.println("s3 is " + s3);
System.out.println(s2.removeFirst());
System.out.println(s2.removeLast());
System.out.println(s3.removeAll(s3));
System.out.println(s3);
    }         
}
