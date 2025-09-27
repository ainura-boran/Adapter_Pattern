public class StudentAdapter implements Student {
    private final CodeStudent src;

    public StudentAdapter(CodeStudent src) {
        this.src = src;
    }

    @Override public String getName() { return src.getName(); }

    @Override
    public String getMajor() {
        String code = src.getMajorCode();
        if (code == null) return "Unknown Major";
        switch (code.trim().toUpperCase()) {
            case "SE": return "Software Engineering";
            case "IT": return "Computer Science";
            case "CS": return "Cyber Security";
            case "IS": return "Information Systems";
            case "MT": return "Media Technologies";
            default:   return "Unknown Major (" + code + ")";
        }
    }
}