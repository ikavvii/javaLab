// Person class representing an attendee
class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getDetails() {
        return "\"" + name + " - " + designation + "\"";
    }
}

class Meeting {
    private String time;
    private String location;
    private String subject;
    private Person[] members;

    public Meeting(String time, String location, String subject, String[][] memberData) {
        this.time = time;
        this.location = location;
        this.subject = subject;
        
        this.members = new Person[memberData.length];
        
        // Creating Person objects INSIDE the Meeting constructor (Composition)
        for (int i = 0; i < memberData.length; i++) {
            this.members[i] = new Person(memberData[i][0], memberData[i][1]);
        }
    }

    public void printDetails() {
        System.out.println("Meeting in " + location + " at " + time + ";");
        System.out.println("Subject: " + subject);
        System.out.print("Attended by: ");
        
        for (int i = 0; i < members.length; i++) {
            System.out.print(members[i].getDetails());
            if (i < members.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class MeetingScheduler {
    public static void main(String[] args) {
        // Raw data for members: [Name, Designation]
        String[][] memberData = {
            {"Vijay", "Vice President"},
            {"Ajay", "Placement Coordinator"}
        };

        Meeting recruiterMeeting = new Meeting(
            "12:30", 
            "Room 205", 
            "Recruiter's Meeting", 
            memberData
        );

        recruiterMeeting.printDetails();
    }
}