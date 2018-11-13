package homework.classes;

import homework.annotations.Chipset;
import homework.annotations.Socket;

@Chipset(name = "X399")
@Socket(name = "sTR4")
public class MSI extends Motherboards {
    public MSI() {
        this.manufacturer = "MSI";
    }

    public MSI(String mark, String model) {
        this();
        this.mark = mark;
        this.model = model;
    }
}
