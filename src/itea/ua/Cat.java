package itea.ua;

import java.io.Serializable;

//@MyAnno(str = "Hi", val = 10)
public class  Cat extends Animal implements Cloneable, Serializable {

    @MyAnno(str = "Field", val = 3)
    public String name = "Hello";

    @Overload
    public String someField = "some value";

    private int age = 13;

    public Cat() {
    }

//    @MyAnno(str = "Const", val = 5)
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [" + "name='" + name + '\'' + ", age=" + age + ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private Cat(String name) {
        this.name = name;
    }
}
