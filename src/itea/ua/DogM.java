package itea.ua;

import java.lang.ref.SoftReference;

public class DogM {
    public static void main(String[] args) {
//        Dog dog1 = new Dog("1");
//        Dog dog2 = new Dog("2");
//        Dog dog3 = new Dog("3");

//        SoftReference<Dog> dog1 = new SoftReference<Dog>(new Dog("1"));
//        SoftReference<Dog> dog2 = new SoftReference<Dog>(new Dog("2"));
//        SoftReference<Dog> dog3 = new SoftReference<Dog>(new Dog("3"));

        DogCacher dog = new DogCacher();
        dog.getDog();
        dog.getDog();
        System.gc();
        dog.getDog();
    }
}
