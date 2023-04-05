package ss05_excersice_static.TestStudent;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Neymar");
        System.out.println(student.getName());
        student.setClasses("N10");
        System.out.println(student.getClasses());

    }
}
