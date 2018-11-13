package homework.classes;

import homework.annotations.Chipset;
import homework.annotations.Socket;

@Chipset(name = "X299")
@Socket(name = "2066")
public class ASUS extends Motherboards {
    public ASUS() {
        this.manufacturer = "ASUS";
    }

    public ASUS(String mark, String model) {
        this();
        this.mark = mark;
        this.model = model;
    }
}
