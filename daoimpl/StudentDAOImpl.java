package daoimpl;

import dao.StudentDAO;
import dto.StudentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import util.DBConnection;

public class StudentDAOImpl implements StudentDAO {

   @Override
public void addStudent(StudentDTO student) {
    try {
        Connection con = DBConnection.getConnection();
        String sql = "INSERT INTO students(name, age, course) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, student.getName());
        ps.setInt(2, student.getAge());
        ps.setString(3, student.getCourse());

        ps.executeUpdate();
        System.out.println("Student added successfully");

    } catch (Exception e) {
        e.printStackTrace();
    }
}


@Override
public void viewStudents() {
    try {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM students");

        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " " +
                rs.getString("name") + " " +
                rs.getInt("age") + " " +
                rs.getString("course")
            );
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
