package dao;

import dto.StudentDTO;

public interface StudentDAO {
    void addStudent(StudentDTO student);
    void viewStudents();
}
