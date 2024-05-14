public class App {
    public static void main(String[] args) throws Exception {
        printStart("main");
        a();
        printEnd("main");
    }

    static void a() {
        printStart("a");
        b();
        printEnd("a");
    }

    static void b() {
        printStart("b");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        printEnd("b");
    }

    static void c() {
        printStart("c");
        Thread.dumpStack();
        printEnd("c");
    }

    static void printStart(String method) {
        System.out.println(STR."Starting \{method} method");
    }

    static void printEnd(String method) {
        System.out.println(STR."Ending \{method} method");
    }
}
