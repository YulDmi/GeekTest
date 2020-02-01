package level5;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;
    private int salary;

    public Worker(String name, String position, String email, String phone, int age, int salary) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public Worker(String name, String position, String phone, int age, int salary) {
        this(name, position,null, phone, age, salary);
    }

    public Worker(String name, String position, int age, int salary) {
        this(name, position, null, age,salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void info(){
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30, 30000);
        persArray[1] = new Worker("Petrov Fedor", "Doctor", "petrovn@mailbox.com", "892123123", 45, 8000);
        persArray[2] = new Worker("Sidorova Svetlana", "Secretary", 55, 20000);
        persArray[3] = new Worker("Kozlov Petr", "Manager", "kozlovn@mailbox.com", "891232312", 28, 60000);
        persArray[4] = new Worker("Tan Tatyana", "supervisor", "892192112", 41, 100000);

        for (int i = 0; i < persArray.length ; i++) {
           if (persArray[i].age > 40) persArray[i].info();
        }
    }
}
