public class RAM {
    private String name;
    private int volume;

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public RAM() {
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
