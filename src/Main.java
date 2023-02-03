public class Main {
    public static void main(String[] args) {
        User user=new User();
        user.setId(1);
        user.setEmail("java@java.com");
        user.setPassword("1234");

        Student student = new Student();
        student.setFirstName("Arif");
        student.setLastName("Ödemiş");

        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");

        UserManager userManager = new UserManager();
        userManager.add(user);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
    }
}