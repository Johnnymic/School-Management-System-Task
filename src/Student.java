public class  Student extends Person {
    private String StudentId;
    private boolean isExpelled;

    public Student(int id, String name, int age, String StudentId, boolean isExpelled) {
        super(id, name, age);
        this.StudentId = StudentId;
        this.isExpelled = isExpelled;
    }

    public boolean isExpelled() {
        return isExpelled;
    }

    public void setExpelled(boolean expelled) {
        isExpelled = expelled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + StudentId + '\'' +
                ", isExpelled=" + isExpelled +
                "} " + super.getName() + " "+ super.getAge();
    }
}