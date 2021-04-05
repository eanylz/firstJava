package day11thisAndEncapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee ob = new Employee();
        ob.setEmpId(1); //set
        ob.setEmpName("Anil"); //set
        System.out.println(ob.getEmpId()); //get
        System.out.println(ob.getEmpName()); //get
    }
}
