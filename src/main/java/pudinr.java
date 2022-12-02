public class pudinr {
    public static void main(String[] args) {
        student student = new student();
        student a = student;
        a.setAge(18);
        a.setName("alice");
        System.out.println(a.toString());
        student b = student;
        System.out.println(b.toString());



    }
}
