package homework.classes;

import homework.annotations.CPUSocket;

@CPUSocket(name = "sTR4")
public class AMD extends CPU {

    public AMD(String name, String chipset) {
        super(name, chipset);
        this.manufacturer = "AMD";
    }

    public AMD() {
        this.manufacturer = "AMD";
    }
}
