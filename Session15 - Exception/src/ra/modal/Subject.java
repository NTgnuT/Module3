package ra.modal;

public class Subject {
    private static int newID = 1;
    private int subjectId;
    private String subjectName;

    public Subject() {
        this.subjectId = newID++;
    }

    public Subject(String subjectName) {
        this.subjectId = newID++;
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
