public class Person {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Person(String fullName, String jobTitle, String email, String phone, float salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.print("fullName: " + fullName+ " ");
        System.out.print("jobTitle: " + jobTitle + " ");
        System.out.print("email: " + email+ " ");
        System.out.print("phone: " + phone+ " ");
        System.out.print("salary: " + salary+ " ");
        System.out.println("age: " + age);
    };
    public int getAge() {
        return age;
    };
}
