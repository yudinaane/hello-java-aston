import java.util.Scanner;

public class AnimalsApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Leo");
        Cat cat = new Cat("Cat", 50, false);
        Dog dog = new Dog("Dog");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину препятствия len ");
        int len = scanner.nextInt();
        animal.printRun(len);
        animal.printSwim(len);
        cat.printRun(len);
        cat.printSwim(len);
        dog.printRun(len);
        dog.printSwim(len);

        //У каждого животного есть ограничения на действия
        // (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        cat.printRunCat(len);
        cat.printSwimCat(len);
        dog.printRunDog(len);
        dog.printSwimDog(len);

        //Добавить подсчет созданных котов, собак и животных.
        System.out.println("Total animals: " + Animal.getCountAnimal());
        System.out.println("Total cats: " + Cat.getCountCat());
        System.out.println("Total dogs: " + Dog.getCountDog());

        //Решить задачу про котов и тарелки с едой, выполнив следующие пункты:
        //Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
        //Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
        //Cчитаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
        PlateCat plateCat = new PlateCat(10);
        plateCat.infoPlateCat();
        if (cat.satietyCat < plateCat.countFood && cat.appetit == false) {
            cat.eat(plateCat);
            cat.appetit = true;
            System.out.println("Котик " + cat.name + " покушал. Он сыт");
        } else {
            System.out.println("Котик " + cat.name + " мало еды в тарелке. Он ее не трогает.");
        }

        //Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        //Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Cotik", 10, false);
        cats[1] = new Cat("Vas'ka", 50, false);
        PlateCat plateCats = new PlateCat(10);
        plateCats.infoPlateCat();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].appetit == false && cats[i].satietyCat <= plateCats.countFood) {
                cats[i].eat(plateCats);
                cats[i].appetit = true;
                System.out.println("Котик " + cats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + cats[i].name + " не поел!");
            }
        }
        plateCats.infoPlateCat();
        System.out.println("Введите кол-во еды, которое добавляем в тарелку:");
        int addCountFood;
        addCountFood = scanner.nextInt();
        plateCats.increaseFood(addCountFood);
        plateCats.infoPlateCat();

    }


}




