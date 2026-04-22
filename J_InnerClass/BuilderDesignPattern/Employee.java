package JavaOopConcept.J_InnerClass.BuilderDesignPattern;

import java.util.Date;
import java.util.List;

/*
                                    TODO --> Object Builder Design Pattern

    Let's assume :
    A company have a employee who have multiple properties (given below in employee class)
    Example :
    Employee1 properties --> Name, Age, Address, PhoneNo, Qualification -- and many more...

    todo --> Case 1: We need to employee registration --
    Is case me hame employee ki kuchh jaruri details chahiye -- Name, Age, Address, PhoneNo, Qualification etc.
    tb ham ek constructor banayenge un jaruri properties ke sath

    Example :
    Employee(String name, int age, String address, long phoneNo){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    todo --> Case 2: We have to increase employee salary based on Performance --
    Is case me hame employee ki kuchh jaruri details chahiye -- Name, Age, Department, Performance etc.
    tb ham ek constructor banayenge un jaruri properties ke sath

    Example :
    Employee(String name, int age, String department, String performance){
        this.name = name;
        this.age = age;
        this.department = department;
        this.performance = performance;
    }

    todo --> Lekin ese to hame employee ke har kaam ke liye ek naya constructor banana padega, or isse code lengthy or            complex ho jayega, then what to do ?
    todo --> To deal with this problem we have a design pattern ---> "Object Builder Design Pattern"

*/

public class Employee {
    private String name;
    private int age;
    private String qualification;
    private String department;
    private int salary;
    private Employee manager;
    private String address;
    private String phoneNumber;
    private String performance;
    private String role;
    private String access;
    private String workLocation;
    private String workMode;
    private boolean isActive;
    private boolean isOnLeave;
    private Date startDate;
    private Date endDate;
    private List<String> assets;



      /// Constructor 1 using all properties
//    public Employee(String name, int age, String qualification, String department, int salary, Employee manager, String       address, String phoneNumber, String performance, String role, String access, String workLocation,String workMode,       boolean isActive, boolean isOnLeave, Date startDate, Date endDate, List<String> assets)
//    {
//        this.name = name;
//        this.age = age;
//        this.qualification = qualification;
//        this.department = department;
//        this.salary = salary;
//        this.manager = manager;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//        this.performance = performance;
//        this.role = role;
//        this.access = access;
//        this.workLocation = workLocation;
//        this.workMode = workMode;
//        this.isActive = isActive;
//        this.isOnLeave = isOnLeave;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.assets = assets;
//    }


      /// Constructor 2 using other important properties
//    public Employee(String name, int age, String department, int salary, Employee manager, String phoneNumber, String                       performance) {
//        this.name = name;
//        this.age = age;
//        this.department = department;
//        this.salary = salary;
//        this.manager = manager;
//        this.phoneNumber = phoneNumber;
//        this.performance = performance;
//    }





//  TODO - 1. to avoid this problem we have to create a inner class inside employee class and and copy all properties of              outer class into inner class
    public static class Builder{
          private String name;
          private int age;
          private String qualification;
          private String department;
          private int salary;
          private Employee manager;
          private String address;
          private String phoneNumber;
          private String performance;
          private String role;
          private String access;
          private String workLocation;
          private String workMode;
          private boolean isActive;
          private boolean isOnLeave;
          private Date startDate;
          private Date endDate;
          private List<String> assets;



          //TODO -- 3. Now creating setter function for all properties of inner class
          public Builder setName(String name) {
              this.name = name;
              return this;
          }

          public Builder setAge(int age) {
              this.age = age;
              return this;
          }

          public Builder setQualification(String qualification) {
              this.qualification = qualification;
              return this;
          }

          public Builder setDepartment(String department) {
              this.department = department;
              return this;
          }

          public Builder setSalary(int salary) {
              this.salary = salary;
              return this;
          }

          public Builder setManager(Employee manager) {
              this.manager = manager;
              return this;
          }

          public Builder setAddress(String address) {
              this.address = address;
              return this;
          }

          public Builder setPhoneNumber(String phoneNumber) {
              this.phoneNumber = phoneNumber;
              return this;
          }

          public Builder setPerformance(String performance) {
              this.performance = performance;
              return this;
          }

          public Builder setRole(String role) {
              this.role = role;
              return this;
          }

          public Builder setAccess(String access) {
              this.access = access;
              return this;
          }

          public Builder setWorkLocation(String workLocation) {
              this.workLocation = workLocation;
              return this;
          }

          public Builder setWorkMode(String workMode) {
              this.workMode = workMode;
              return this;
          }

          public Builder setActive(boolean active) {
              isActive = active;
              return this;
          }

          public Builder setOnLeave(boolean onLeave) {
              isOnLeave = onLeave;
              return this;
          }

          public Builder setStartDate(Date startDate) {
              this.startDate = startDate;
              return this;
          }

          public Builder setEndDate(Date endDate) {
              this.endDate = endDate;
              return this;
          }

          public Builder setAssets(List<String> assets) {
              this.assets = assets;
              return this;
          }

          public Employee build(){
              return new Employee(this);
          }
      }



    //TODO -- 2. Now creating constructor of Employee class and passing its obj to constructor
    public Employee(Builder empObj) {
        this.name = empObj.name;
        this.age = empObj.age;
        this.qualification = empObj.qualification;
        this.department = empObj.department;
        this.salary = empObj.salary;
        this.manager = empObj.manager;
        this.address = empObj.address;
        this.phoneNumber = empObj.phoneNumber;
        this.performance = empObj.performance;
        this.role = empObj.role;
        this.access = empObj.access;
        this.workLocation = empObj.workLocation;
        this.workMode = empObj.workMode;
        this.isActive = empObj.isActive;
        this.isOnLeave = empObj.isOnLeave;
        this.startDate = empObj.startDate;
        this.endDate = empObj.endDate;
        this.assets = empObj.assets;
    }


    // toString method to print object value

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", qualification='" + qualification + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", manager=" + manager +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", performance='" + performance + '\'' +
                ", role='" + role + '\'' +
                ", access='" + access + '\'' +
                ", workLocation='" + workLocation + '\'' +
                ", workMode='" + workMode + '\'' +
                ", isActive=" + isActive +
                ", isOnLeave=" + isOnLeave +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", assets=" + assets +
                '}';
    }
}
