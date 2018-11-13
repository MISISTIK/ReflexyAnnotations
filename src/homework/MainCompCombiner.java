package homework;

import homework.annotations.CPUSocket;
import homework.annotations.Chipset;
import homework.annotations.Socket;
import homework.classes.*;

public class MainCompCombiner {
    public static void main(String[] args) {
        //--------------CPU-----------------
        Intel cpu1 = new Intel("Intel Core I9-7900X", "X299");
        AMD cpu3 = new AMD("Ryzen Threadripper 1950X", "X399");
/*
        @CPUSocket(name = "1151")
        Intel cpu2 = new Intel("Intel Core i7-8086K", "Z370");

        @CPUSocket(name = "AM4")
        AMD cpu4 = new AMD("AMD Ryzen 5 1600", "A320");

*/
        //----------Motherboards------------
        ASUS mb1 = new ASUS("ASUS TUF X299", "Mark 2");
        MSI mb3 = new MSI("MSI X399", "SLI Plus");

/*
        @Chipset(name = "A320")
        @Socket(name = "AM4")
        ASUS mb2 = new ASUS("Asus Prime", "A320M-A");

        @Chipset(name = "Z370")
        @Socket(name = "1151")
        MSI mb4 = new MSI("MSI Z370", "A PRO");
*/

        CompCombiner compCombiner = new CompCombiner();
        compCombiner.loadCPUs(cpu1, cpu3);
        compCombiner.loadMotherboards(mb1, mb3);
        compCombiner.listAll();
        compCombiner.doCombine();

    }



    private static void print(Object s) {
        System.out.println(s);
    }
}
