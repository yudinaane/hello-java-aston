public class Cat extends Animal {
    public int satietyCat;
    public boolean appetit;
    static int countCat = 0;

    public Cat(String name, int satietyCat, boolean appetit) {
        this.name = name;
        this.satietyCat = satietyCat;
        this.appetit = appetit;
        countCat++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatietyCat() {
        return satietyCat;
    }

    public void setSatietyCat(int satietyCat) {
        this.satietyCat = satietyCat;
    }

    public boolean getAppetit() {
        return appetit;
    }

    public void setAppetit(boolean appetit) {
        this.appetit = appetit;
    }

    public static int getCountCat() {
        return countCat;
    }

    public void printRunCat(int len) {
        if (len > 200) {
            System.out.println("Кот не может пробежать более 200 м");
        } else {
            printRun(len);
        }
    }


    public void printSwimCat(int len) {
        System.out.println("Кот не умеет плавать");
    }

    public void eat(PlateCat p) {
        p.decreaseFood(satietyCat);
    }


}








