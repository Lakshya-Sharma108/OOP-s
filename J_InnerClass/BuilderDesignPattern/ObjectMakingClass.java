package JavaOopConcept.J_InnerClass.BuilderDesignPattern;

public class ObjectMakingClass {
    public static void main(String[] args) {
        Employee obj = new Employee.Builder().setName("Lakshaya").setAge(20).setAddress("Bharatpur").setActive(true).setDepartment("Back-end").setSalary(180000).build();

        System.out.println(obj);
    }
}
