package JavaOopConcept.OopsTask.FourthTask;

public class MainClass {
    public static void main(String[] args) {

        Student s1 = new Student(101, "lakshaya", "BCA", 30000);
//        System.out.println("Student details --");
//        System.out.println("Student ID : "+s1.id+"\nStudent Name : "+s1.name+"\nStudent Course : "+s1
//                            .course+"\nPaid Fees : "+s1.feesPaid);

        Student s2 = new Student(s1);
//        System.out.println("Student details --");
//        System.out.println("Student ID : "+s2.id+"\nStudent Name : "+s2.name+"\nStudent Course : "+s2
//                            .course+"\nPaid Fees : "+s2.feesPaid);

        Student s3 = new Student();
//        System.out.println("Student details --");
//        System.out.println("Student ID : "+s3.id+"\nStudent Name : "+s3.name+"\nStudent Course : "+s3
//                            .course+"\nPaid Fees : "+s3.feesPaid);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
