
class HelloWorld {
    public static void main(String[] args) {
        Integer x = 0;
        increment(x);
        System.out.println(x);

        makeNull(x);
        System.out.println(x);

        Integer y = null;
        newInt(y);
        System.out.println(y);

    }

    static void increment(Integer x) {
        x = x + 1;
    }

    static void makeNull(Integer x) {
        x = null;
    }

    static void newInt(Integer y) {
        y = 1;
    }
}



