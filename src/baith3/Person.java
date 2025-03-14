package baith3;

public class Person {
    private static int idCounter = 1; // Biến static để tự động tăng ID
    private int id;
    private String name;
    private final int yearOfBirth; // Không thể thay đổi sau khi khởi tạo
    private Gender gender;

    // Constructor
    public Person(String name, int yearOfBirth, Gender gender) {
        this.id = idCounter++;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    // Getter cho ID
    public int getId() {
        return id;
    }

    // Getter và Setter cho Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter cho YearOfBirth (không có setter vì là final)
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // Getter và Setter cho Gender
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Year of Birth: " + yearOfBirth +
                ", Gender: " + gender);
    }
}
