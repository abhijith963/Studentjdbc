package dto;

public class StudentDTO {
    private int id;
    private String name;
    private int age;
    private String course;

    public StudentDTO(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
}
