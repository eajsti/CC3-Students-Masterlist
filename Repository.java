import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private String url = "jdbc:sqlite:repository.db";

    public void addStudent(Student student) {
    String sql = "INSERT INTO tbl_repositorydb(Firstname, Surname, Age, Gender, Year, Section, Address, Phonenumber, Bloodtype) VALUES(?,?,?,?,?,?,?,?,?)";
    
    try (Connection conn = DriverManager.getConnection(url);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, student.getFirstname());
        pstmt.setString(2, student.getSurname());
        pstmt.setInt(3, student.getAge());
        pstmt.setString(4, student.getGender());
        pstmt.setInt(5, student.getYear());
        pstmt.setString(6, student.getSection());
        pstmt.setString(7, student.getAddress());
        pstmt.setInt(8, student.getPhoneNumber());
        pstmt.setString(9, student.getBloodType());
        pstmt.executeUpdate();
        
    } catch (SQLException e) {
        System.out.println("Database error (Add): " + e.getMessage());
    }
}

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM tbl_repositorydb";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student student = new Student.StudentBuilder()
                        .setStudentID(rs.getInt("StudentID"))
                        .setFirstName(rs.getString("Firstname"))
                        .setSurname(rs.getString("Surname"))
                        .setAge(rs.getInt("Age"))
                        .setGender(rs.getString("Gender"))
                        .setYear(rs.getInt("Year"))
                        .setSection(rs.getString("Section"))
                        .setAddress(rs.getString("Address"))
                        .setPhoneNumber(rs.getInt("Phonenumber"))
                        .setBloodType(rs.getString("Bloodtype"))
                        .build();
                students.add(student);
            }
        } catch (SQLException e) {
            System.out.println("Database error (Get): " + e.getMessage());
        }
        return students;
    }
}