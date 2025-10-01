public class StudentTest {
    public static void main(String[] args) {
            Student s1 = StudentData.createS1();
            Student s2 = StudentData.createS2();
            Student s3 = StudentData.createS3();
            Student s4 = StudentData.createS4();

            System.out.println(s1.getName() + " studies at " + s1.getMajor());
            System.out.println(s2.getName() + " studies at " + s2.getMajor());
            System.out.println(s3.getName() + " studies at " + s3.getMajor());
            System.out.println(s4.getName() + " studies at " + s4.getMajor());
    }
}