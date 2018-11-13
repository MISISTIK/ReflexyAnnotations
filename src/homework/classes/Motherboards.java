package homework.classes;

public class Motherboards {
    String mark;
    String model;
    protected String manufacturer;

    public Motherboards() {
    }

    public Motherboards(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String getMarkAndModel() {
        return mark + " " + model;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + " {" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
