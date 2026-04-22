package JavaOopConcept.OopsTask.FourthTask;

public class Student {
    int id;
    String name;
    String course;
    double feesPaid;


    public Student() {
        this.id = 0;
        this.name = null;
        this.course = null;
        this.feesPaid = 0.0;
    }

    public Student(int id, String name, String course, double feesPaid) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.feesPaid = feesPaid;
    }

    public Student(Student obj){
        this.id = obj.id;
        this.name = obj.name;
        this.course = obj.course;
        this.feesPaid = obj.feesPaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", feesPaid=" + feesPaid +
                '}';
    }
}
