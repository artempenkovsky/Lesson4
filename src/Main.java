public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000, "Asus");
        System.out.println(computer1);
        Computer computer2 = new Computer(2000, "Apple",
                new RAM("Kingston", 16), new HDD("Hitachi", 1000, "inside"));
        System.out.println(computer2);
    }
}