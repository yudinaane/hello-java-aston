
public class Animal {
    String name;
    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printRun(int len) {
        setName(name);
        System.out.println(name + " ran " + len + " m");
    }

    public void printSwim(int len) {
        setName(name);
        System.out.println(name + " swam " + len + " m");
    }


    public static int getCountAnimal() {
        return countAnimal;
    }


}


