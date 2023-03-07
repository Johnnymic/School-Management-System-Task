public class Main {
    public static void main(String[] args) {

        Student student = new Student(34, "Stephen", 20, "006", false);
        student.setExpelled(true);
        //System.out.println(student.isExpelled);
        System.out.println(student.toString());

    }
}