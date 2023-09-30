
class s {
    static int i;
    double d;

    public static void main(String[] args) {
        s tl = new s();
        tl.i++;
        tl.d++;
        System.out.println(tl.i);
        System.out.println(tl.d);

        s t3 = tl;
        t3.i = t3.i++;
        t3.d = t3.i + t3.d + 7.325;
        System.out.println(tl.i);
        System.out.println(tl.d);
        System.out.println(t3.i);
        System.out.println(t3.d);
    }
}

