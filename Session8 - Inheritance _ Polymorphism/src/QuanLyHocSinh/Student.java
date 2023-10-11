package QuanLyHocSinh;

public class Student extends User {
    private String subject;

    public Student(String name, String password, String subject) {
        super(name, password);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override // ghi đè
    public void displayData() {
        super.displayData();
        System.out.println(" Môn học: " + getSubject());
    }
}
