public class Student {

    
    private final String FirstName;
    private final String Surname;
    private final int Age;
    private final String Gender;
    private final int Year;
    private final String Section;
    private final int StudentID;
    private final String Address;
    private final int PhoneNumber;
    private final String BloodType;

   
    private Student(StudentBuilder builder) {
        this.FirstName = builder.FirstName;
        this.Surname = builder.Surname;
        this.Age = builder.Age;
        this.Gender = builder.Gender;
        this.Year = builder.Year;
        this.Section = builder.Section;
        this.StudentID = builder.StudentID;
        this.Address = builder.Address;
        this.PhoneNumber = builder.PhoneNumber;
        this.BloodType = builder.BloodType;
    }

    
    public String getFirstname() {
        return FirstName;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public int getYear() {
        return Year;
    }

    public String getSection() {
        return Section;
    }

    public int getStudentID() {
        return StudentID;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getBloodType() {
        return BloodType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + StudentID +
                ", FirstName='" + FirstName + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                ", Gender='" + Gender + '\'' +
                ", Year=" + Year +
                ", Section='" + Section + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", BloodType='" + BloodType + '\'' +
                '}';
    }

   
    public static class StudentBuilder {

        // --- fields ---
        private String FirstName;
        private String Surname;
        private int Age;
        private String Gender;
        private int Year;
        private String Section;
        private int StudentID;
        private String Address;
        private int PhoneNumber;
        private String BloodType;

       
        public StudentBuilder setFirstName(String FirstName) {
            this.FirstName = FirstName;
            return this;
        }

        public StudentBuilder setSurname(String Surname) {
            this.Surname = Surname;
            return this;
        }

        public StudentBuilder setAge(int Age) {
            this.Age = Age;
            return this;
        }

        public StudentBuilder setGender(String Gender) {
            this.Gender = Gender;
            return this;
        }

        public StudentBuilder setYear(int Year) {
            this.Year = Year;
            return this;
        }

        public StudentBuilder setSection(String Section) {
            this.Section = Section;
            return this;
        }

        public StudentBuilder setStudentID(int StudentID) {
            this.StudentID = StudentID;
            return this;
        }

        public StudentBuilder setAddress(String Address) {
            this.Address = Address;
            return this;
        }

        public StudentBuilder setPhoneNumber(int PhoneNumber) {
            this.PhoneNumber = PhoneNumber;
            return this;
        }

        public StudentBuilder setBloodType(String BloodType) {
            this.BloodType = BloodType;
            return this;
        }

        
        public Student build() {
    if (FirstName == null || FirstName.trim().isEmpty()) {
        throw new IllegalArgumentException("FirstName is required");
    }
    if (Surname == null || Surname.trim().isEmpty()) {
        throw new IllegalArgumentException("Surname is required");
    }

    return new Student(this);
}
    }
}