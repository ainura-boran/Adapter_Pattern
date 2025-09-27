public class StudentData {

    public static Student createS1() {
        return new StudentAdapter(new CodeStudent("Ainur Boranova", "SE"));
    }

    public static Student createS2() {
        return new StudentAdapter(new CodeStudent("Aruzhan Saparova", "MT"));
    }

    public static Student createS3() {
        return new StudentAdapter(new CodeStudent("Dana Alim", "CS"));
    }

    public static Student createS4() {
        return new StudentAdapter(new CodeStudent("Miras Temirkhan", "BIO"));
    }
}
