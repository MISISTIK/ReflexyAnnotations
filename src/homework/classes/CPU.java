package homework.classes;

public class CPU {
    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", chipset='" + chipset + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public CPU(String name, String chipset) {
        this.name = name;
        this.chipset = chipset;
    }

    String chipset;
    protected String manufacturer;

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public CPU() {
    }




}
