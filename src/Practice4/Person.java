package Practice4;

public class Person {
    private static int count = 0;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double weight;
    private double height;

    // インスタンスフィールドに「job」を追加してください
    private String job;

    // コンストラクタを書き換えてください
    Person(String firstName, String lastName, int age, double height, double weight, String job) {
        Person.count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.job = job;
    }

    // コンストラクタを書き換えて下さい
    Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
        this(firstName, lastName, age, height, weight, job);
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String  getJob() {
        return this.job;
    }


    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String fullName() {
        if(this.middleName == null) {
            return this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " " + this.middleName + " " + this.lastName;
        }
    }

    public void printData() {
        System.out.println("私の名前は" + this.fullName() + "です");
        System.out.println("年齢は" + this.age + "歳です");
        System.out.println("BMIは" + Math.round(this.bmi()) + "です");
        System.out.println("仕事は" + this.job + "です");
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }
}
