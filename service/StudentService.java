package service;

import dao.StudentDAO;
import daoimpl.StudentDAOImpl;
import dto.StudentDTO;

public class StudentService {

    StudentDAO dao = new StudentDAOImpl();

    public void addStudent(StudentDTO student) {
        dao.addStudent(student);
    }

    public void displayStudents() {
        dao.viewStudents();
    }
}
