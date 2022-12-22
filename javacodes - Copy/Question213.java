class Member {
    String name;
    int age;
    int phone;
    String address;
    int salary;
}

class Employee extends Member{

    String specialisation;

    void print(){
        System.out.println("NAME : "+ name +";" +"age "+ age + ";phone number : "+ phone +";address :"+ address + " ; Salary"+ salary +"; specialization : " + specialisation);
    }
}

class Manager extends Member{

    String department;


    void print(){
        System.out.println("NAME : "+ name +";" +"age "+ age + ";phone number : "+ phone +";address "+ address + " ; Salary"+ salary +"; department : " + department);
    }
}
public class Question213 {

    public static void main(String[] args) {

        Employee one=new Employee();
        one.name="Rohan";
        one.age=20;
        one.phone=92323;
        one.address="lalbagh";
        one.salary=3200000;
        one.specialisation="xyz";
        one.print();

        Manager two=new Manager();
        two.name="Mohan";
        two.age=29;
        two.phone=92233;
        two.address="ayodhya";
        two.salary=9200000;
        two.department="zx";
        two.print();
    }
    
}
