public class MainClass {
    public static void main(String[] args) {
        Person person = new Person("Ivan Petrov", "analitic", "petrov@mail.ru", "+798563254", 5000, 41);
        person.printInfo();

        Person[] empArr = new Person[5];
        empArr[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 2000, 40);
        empArr[1] = new Person("Petrova Anna", "Analitic", "petrovaan@mailbox.com", "892312314", 1000, 41);
        empArr[2] = new Person("Sidorova Elena", "QA Engineer", "sidorovaHelen12@mailbox.com", "892312315", 7500, 43);
        empArr[3] = new Person("Em Tatyana", "Teacher", "tanysatanysa@mailbox.com", "892312316", 8000, 55);
        empArr[4] = new Person("Li Petr", "Teacher", "liPetr@mailbox.com", "892512312", 6000, 31);
        for (Person pers : empArr) {
            if (pers.getAge() > 40) {
                pers.printInfo();
            }
        }
    }

}

