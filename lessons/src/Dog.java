public class Dog extends Animal {
    static int countDog = 0;

    public Dog(String name) {
        this.name = name;
        countDog++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCountDog() {
        return countDog;
    }

    public void printRunDog(int len) {
        if (len > 500) {
            System.out.println("Собака не может бегать более 500 м");
        } else {
            printRun(len);
        }
    }

    public void printSwimDog(int len) {
        if (len > 10) {
            System.out.println("Собака не умеет плавать болше 10 м");
        } else {
            printRun(len);
        }
        ;
    }
}









