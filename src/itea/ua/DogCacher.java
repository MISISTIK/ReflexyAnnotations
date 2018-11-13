package itea.ua;

import java.lang.ref.WeakReference;

public class DogCacher {
    private WeakReference<Dog> dog = new WeakReference<Dog>(new Dog("Dog"));

    Dog getDog() {
        if (dog.get() == null) {
            dog = new WeakReference<Dog>(new Dog("Dog"));
            System.out.println("New dog created");
        } else {
            System.out.println("Here is your old dog");
        }
        return dog.get();
    }

}
