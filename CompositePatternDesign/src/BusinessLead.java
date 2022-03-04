//Business Lead Class

import java.util.*;
public class BusinessLead implements Employee {
    private int id;
    private String name;
    private double salary;
    public BusinessLead(int id,String name,double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    List<Employee> employees=new ArrayList<Employee>();
    public void add(Employee employee) {
        employees.add(employee);
    }
    public Employee getChild(int i) {
        return employees.get(i);
    }
    public void remove(Employee employee) {
        employees.remove(employee);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void print() {
        System.out.println("-------------------------");
        System.out.println("Id="+getId());
        System.out.println("Name="+getName());
        System.out.println("Salary="+getSalary());
        System.out.println("-------------------------");
        Iterator<Employee> it=employees.iterator();
        while(it.hasNext()) {
        Employee employee=it.next();
        employee.print();
    }
    }
}