class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {}

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    private void setName(String name) {
        this.name = name;
    }
    private void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString() {
        return "Student: " + name + " " + classes;
    }
    public String getName() {
        return name;
    }
    public String getClasses() {
        return classes;
    }
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Before changing values: " + student);

        System.out.println("After trying to change values: " + student);
    }
}