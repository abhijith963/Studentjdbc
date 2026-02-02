import dto.StudentDTO;
import service.StudentService;

public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        StudentDTO student = new StudentDTO("Akhil", 22, "CSE");

        service.addStudent(student);

        service.displayStudents();
    }
}
