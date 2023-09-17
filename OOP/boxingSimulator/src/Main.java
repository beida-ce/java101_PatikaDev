public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("abc", 15, 100,90,10);
        Fighter f2 = new Fighter("xyz", 20, 100, 100, 50);
        Ring ring = new Ring(f1,f2,90,100);
        ring.run();
    }
}