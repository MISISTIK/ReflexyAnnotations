package itea.ua;

import java.lang.reflect.*;
import java.util.Arrays;

public class CatM {
    public static void main(String[] args) {
        Cat cat = new Cat("Susleg",5);
        Class clazz = cat.getClass();
//        Class clazz = itea.ua.Cat.class;
        int mods = clazz.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("Public");
        }

        System.out.println(clazz.getSuperclass());
        Class[] inter = clazz.getInterfaces();
        System.out.println("----------Interfaces---------");
        Arrays.stream(inter).forEach((e) -> System.out.println(e.getSimpleName()));
        Field[] fields = clazz.getFields();
        System.out.println("----------Fields---------");
        Arrays.stream(fields).forEach(e -> {
            try {
                System.out.println(e.getName() + " = " + e.get(cat));
                Field f = clazz.getField("someField");
                String name = (String) f.get(cat);
                System.out.println(f.getName() + " = " + name);
                f.set(cat,"Krevedko");
                System.out.println(cat);

                Method[] meth = clazz.getMethods();
                Arrays.stream(meth).forEach(System.out::println);

                Constructor[] cons = clazz.getConstructors();
                for (Constructor c : clazz.getConstructors()) {
                    System.out.println("----- Constructor: " + c + " - " + c.getParameterCount() +  " args ------");
                    for (Parameter p : c.getParameters()) {
                        System.out.println("Parameter: " + p);
                    }
                }



            } catch (IllegalAccessException | NoSuchFieldException e1) {
                e1.printStackTrace();
            }
        });


    }
}
