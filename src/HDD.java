public class HDD {
    private String name;
    private int volume;
    private String type;

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type=" + type +
                '}';
    }

    public HDD() {
    }
}
