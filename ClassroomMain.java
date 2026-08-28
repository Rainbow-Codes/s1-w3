public class ClassroomMain {
    public static void main(String[] args) {
        Classroom r1 = new Classroom("Rasband", 30, 26);
        Classroom m1 = new Classroom("Morris");

        m1.setDesks(30);

        System.out.println(
            "r1 - Teacher: "+r1.teacher()+
            " - Students: "+r1.students()+
            " - Desks: "+r1.desks());
    }
}
