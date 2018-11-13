package itea.ua;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CatMN {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class clazz = itea.ua.Cat.class;
        Object obj = clazz.newInstance();
        System.out.println(obj);

        Cat cat = (Cat) Class.forName("itea.ua.Cat").newInstance();
//        Class<?> cat1 = Class.forName("itea.ua.Cat");
        System.out.println(cat);



        Method methodSet = clazz.getMethod("setName", java.lang.String.class);
        methodSet.invoke(cat,"Cotyara");

        Method method = clazz.getMethod("getName");
        System.out.println(method.invoke(cat));

        System.out.println(cat);
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(cat, 666);
        System.out.println(cat);

    }
}
