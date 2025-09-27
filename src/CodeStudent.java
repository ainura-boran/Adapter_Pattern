public class CodeStudent {
    private final String name;
    private final String majorCode;

    public CodeStudent(String name, String majorCode) {
        this.name = name;
        this.majorCode = majorCode;
    }

    public String getName()      { return name; }
    public String getMajorCode() { return majorCode; }
}