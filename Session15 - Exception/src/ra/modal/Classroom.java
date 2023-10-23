package ra.modal;

public class Classroom {
    private static int newID = 1;
    private int classroomId;
    private String classroomName;
    private boolean status;

    public Classroom() {
        this.classroomId = newID++;
    }

    public Classroom(String classroomName, boolean status) {
        this.classroomId = newID++;
        this.classroomName = classroomName;
        this.status = status;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId=" + classroomId +
                ", classroomName='" + classroomName + '\'' +
                ", status=" + status +
                '}';
    }
}
