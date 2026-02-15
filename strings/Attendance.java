class Attendance {
    public static void main(String[] args) {
        boolean[] att = new boolean[30];
        // Mark absent students as true
        att[0] = true;  
        att[4] = true; 
        att[5] = true;
        att[6] = true;
        att[7] = true;
        int presentCount = 0;
        
        for (boolean status : att) {
            if (!status) {
                presentCount++;
            }
        }
        
        int absentCount = att.length - presentCount;
        System.out.println("Present=" + presentCount + " Absent=" + absentCount);
    }
}