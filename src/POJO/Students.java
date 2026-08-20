package POJO;

public class Students {
//    Fields
    private int ID_number;
    private String SName;
    private final String Subject1 = "Mathematics";
    private final String Subject2 = "English";
    private final String Subject3 = "Kiswahili";
    private final String Subject4 = "Physics";
    private final String Subject5 = "CRE";
    private String Subject6;
    private String Subject7;

//    Constructor
    public Students(int ID_number, String SName, String subject6, String subject7) {
        this.ID_number = ID_number;
        this.SName = SName;
        this.Subject6 = subject6;
        this.Subject7 = subject7;
    }

//    Getters and Setters

    public int getID_number() {
        return ID_number;
    }

    public void setID_number(int ID_number) {
        this.ID_number = ID_number;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSubject1() {
        return Subject1;
    }

    public String getSubject2() {
        return Subject2;
    }

    public String getSubject3() {
        return Subject3;
    }

    public String getSubject4() {
        return Subject4;
    }

    public String getSubject5() {
        return Subject5;
    }

    public String getSubject6() {
        return Subject6;
    }

    public void setSubject6(String subject6) {
        Subject6 = subject6;
    }

    public String getSubject7() {
        return Subject7;
    }

    public void setSubject7(String subject7) {
        Subject7 = subject7;
    }
}
