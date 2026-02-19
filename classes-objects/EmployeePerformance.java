class EmployeePerformance {
    private String employeeName;
    private String department;

    private StringBuilder managerRemarks;
    private int[] performanceRatings = new int[5];

    EmployeePerformance(String name, String dept) {
        employeeName = name;
        department = dept;
    }

    void addManagerRemarks(String remark) {
        if (managerRemarks == null) {
            managerRemarks = new StringBuilder();
        }
        managerRemarks.append(remark).append("\n");
    }

    void setPerformanceRatings(int[] ratings) {
        if (ratings.length == 5) {
            this.performanceRatings = ratings;
        } else {
            System.out.println("Please provide exactly 5 performance ratings.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee Name: ").append(employeeName).append("\n");
        sb.append("Department: ").append(department).append("\n");
        sb.append("Manager Remarks: ").append(managerRemarks != null ? managerRemarks.toString() : "No remarks");
        sb.append("Performance Ratings: ");
        for (int i = 0; i < performanceRatings.length; i++) {
            switch (i) {
                case 0:
                    sb.append("Punctuality: ");
                    break;
                case 1:
                    sb.append("Clarity in Work: ");
                    break;
                case 2:
                    sb.append("Effort: ");
                    break;
                case 3:
                    sb.append("Correctness: ");
                    break;
                case 4:
                    sb.append("Responsibility: ");
                    break;
            }
            sb.append(performanceRatings[i]);
            if (i < performanceRatings.length - 1) {
                sb.append(", ");
            } else {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        EmployeePerformance emp1 = new EmployeePerformance("Kevin", "Sales");
        emp1.addManagerRemarks("Excellent performance in Q1.");
        emp1.setPerformanceRatings(new int[] { 5, 4, 5, 4, 5 });
        System.out.println(emp1);

        EmployeePerformance emp2 = new EmployeePerformance("Sai", "Marketing");
        emp2.addManagerRemarks("Needs improvement in punctuality.");
        emp2.setPerformanceRatings(new int[] { 3, 4, 4, 3, 4 });
        System.out.println(emp2);

        EmployeePerformance emp3 = new EmployeePerformance("Kathy", "HR");
        emp3.addManagerRemarks("Consistent performer with great responsibility.");
        emp3.addManagerRemarks("Shows great effort in all tasks.");
        emp3.setPerformanceRatings(new int[] { 4, 5, 5, 5, 5 });
        System.out.println(emp3);
    }
}