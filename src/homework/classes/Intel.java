package homework.classes;

import homework.annotations.CPUSocket;

@CPUSocket(name = "2066")
public class Intel extends CPU {

    public Intel(String name, String chipset) {
        super(name, chipset);
        this.manufacturer = "Intel";
    }

    public Intel() {
        this.manufacturer = "Intel";
    }

}
