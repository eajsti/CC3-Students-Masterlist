import java.util.List;

public class Main {

    public static void main(String[] args) {

        Repository repository = new Repository();

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("Christopher Jake")
                .setSurname("San Andres")
                .setAge(19)
                .setGender("Male")
                .setYear(2)
                .setSection("BSIT 2-11")
                .setAddress("Valenzuela City")
                .setPhoneNumber(948694227)
                .setBloodType("O+")
                .build());

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("Justine")
                .setSurname("Alamer")
                .setAge(21)
                .setGender("Male")
                .setYear(2)
                .setSection("BSIT 2-8")
                .setAddress("Valenzuela City")
                .setPhoneNumber(912345002)
                .setBloodType("AB+")
                .build());

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("Jake")
                .setSurname("Rivera")
                .setAge(19)
                .setGender("Male")
                .setYear(1)
                .setSection("BSIT 2-8")
                .setAddress("Valenzuela City")
                .setPhoneNumber(912345003)
                .setBloodType("B+")
                .build());

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("Wyncess Leonie")
                .setSurname("Noynay")
                .setAge(20)
                .setGender("Female")
                .setYear(2)
                .setSection("BECED 2-3")
                .setAddress("Bulacan")
                .setPhoneNumber(912345004)
                .setBloodType("AB+")
                .build());

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("Maria")
                .setSurname("Lopez")
                .setAge(20)
                .setGender("Female")
                .setYear(2)
                .setSection("BSIT 2-2")
                .setAddress("Taguig")
                .setPhoneNumber(912345005)
                .setBloodType("O-")
                .build());

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("Kyle")
                .setSurname("Torres")
                .setAge(23)
                .setGender("Male")
                .setYear(4)
                .setSection("BSIT 4-3")
                .setAddress("Makati")
                .setPhoneNumber(912345006)
                .setBloodType("A-")
                .build());

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("Liza")
                .setSurname("Morales")
                .setAge(18)
                .setGender("Female")
                .setYear(1)
                .setSection("BSIT 1-2")
                .setAddress("Parañaque")
                .setPhoneNumber(912345007)
                .setBloodType("B-")
                .build());

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("David")
                .setSurname("Cruz")
                .setAge(21)
                .setGender("Male")
                .setYear(3)
                .setSection("BSIT 3-1")
                .setAddress("Las Piñas")
                .setPhoneNumber(912345008)
                .setBloodType("O+")
                .build());

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("Sofia")
                .setSurname("Ramos")
                .setAge(20)
                .setGender("Female")
                .setYear(2)
                .setSection("BSIT 2-3")
                .setAddress("Marikina")
                .setPhoneNumber(912345009)
                .setBloodType("AB-")
                .build());

        repository.addStudent(new Student.StudentBuilder()
                .setFirstName("Ethan")
                .setSurname("Villanueva")
                .setAge(22)
                .setGender("Male")
                .setYear(4)
                .setSection("BSIT 4-3")
                .setAddress("Mandaluyong")
                .setPhoneNumber(912345010)
                .setBloodType("A+")
                .build());

        List<Student> students = repository.getAllStudent();

        System.out.println("===== MASTER LIST OF STUDENTS =====");

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);

            System.out.println(
                    student.getStudentID() + " | " +
                    student.getFirstname() + " " + student.getSurname() +
                    " | Age: " + student.getAge() +
                    " | " + student.getGender() +
                    " | Year " + student.getYear() + " - " + student.getSection() +
                    " | " + student.getAddress() +
                    " | Phone: " + student.getPhoneNumber() +
                    " | Blood Type: " + student.getBloodType()
            );
        }
    }
}