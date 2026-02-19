class CourseRegistration {
    private String courseName;
    private String studentName;
    private StringBuilder learningGoals;
    private String[] moduleName;

    public CourseRegistration(String courseName, String studentName) {
        this.courseName = courseName;
        this.studentName = studentName;
        learningGoals = new StringBuilder();
    }

    private void addLearningGoal(String learningGoal) {
        learningGoals.append(learningGoal).append("\n");
    }

    public void addModule(String... moduleNames) {
        this.moduleName = moduleNames;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(courseName).append("\n");
        sb.append("Student: ").append(studentName).append("\n");
        if (learningGoals != null) {
            sb.append("Learning Goals:\n").append(learningGoals.toString());
        }
        if (moduleName != null && moduleName.length > 0) {
            sb.append("Modules:\n");
            for (String module : moduleName) {
                sb.append("- ").append(module).append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CourseRegistration registration = new CourseRegistration("Java Programming", "Kavin");
        registration.addLearningGoal("Understand basic syntax");
        registration.addLearningGoal("Learn object-oriented programming");
        registration.addModule("Introduction to Java", "Classes and Objects", "Inheritance and Polymorphism");

        System.out.println(registration);
    }
}