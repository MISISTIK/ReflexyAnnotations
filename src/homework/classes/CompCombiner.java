package homework.classes;

import homework.annotations.CPUSocket;
import homework.annotations.Chipset;
import homework.annotations.Socket;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompCombiner {
    CPU[] cpus;
    Motherboards[] motherboards;

    public CompCombiner() {

    }

    public void loadCPUs(CPU... cpu) {
        this.cpus = cpu;
    }

    public void loadMotherboards(Motherboards... motherboard) {
        this.motherboards = motherboard;
    }

    public void listAll() {
        System.out.println("---------------------- CPUs -----------------------");
        Arrays.stream(cpus).forEach(System.out::println);
        System.out.println("------------------- Motherboards ------------------");
        Arrays.stream(motherboards).forEach(System.out::println);
    }

    public List<String> doCombine() {
        WeakReference<List<String>> cominations = new WeakReference<>(new ArrayList<>());
//        Decomenting of the line below nullify the variable "combinations"
//        System.gc();
        if (cominations.get() != null) {
            if (cpus.length > 0 && motherboards.length > 0) {
                System.out.println("------------------ Cominations: -------------------");
                System.out.println();
                for (CPU c : cpus) {
                    String cpu_socket = c.getClass().getAnnotation(CPUSocket.class).name();
                    for (Motherboards m : motherboards) {
                        String mb_socket = m.getClass().getAnnotation(Socket.class).name();
                        String mb_chipset = m.getClass().getAnnotation(Chipset.class).name();
                        if (mb_chipset.equals(c.getChipset()) && mb_socket.equals(cpu_socket)) {
                            cominations.get().add("You can combine cpu |" + c.getName() + "|" + cpu_socket + "| and mb |" + m.getMarkAndModel() + "|" + mb_socket + "|" + mb_chipset + "|");
                        }
                    }
                }
                cominations.get().forEach(System.out::println);
            } else {
                System.out.println("Empty list of CPUs or Motherboards");
            }
            return cominations.get();
        } else {
            System.out.println("\nThe Weak Reference has been destroyed :(");
            return Collections.emptyList();
        }

    }
}
