
import java.io.File;
import java.io.FileWriter;
import java.util.*;
class Employee{
	String name,depart;
	int y,no;
	float sal;
	Scanner sc=new Scanner(System.in);
	public void mEmplo() {
		try {
			File fi1=new File("Employee.txt");
			File fi2=new File("Valid.txt");
			File fi3=new File("Invalid.txt");
			
			if(fi1.createNewFile()||fi1.exists()) {
				System.out.println("Enter Employee Name: ");
				name=sc.nextLine();
				System.out.println("Enter Employee Department: ");
				depart=sc.nextLine();
				System.out.println("Enter Employee Number: ");
				no=sc.nextInt();
				System.out.println("Enter Employee Experience in Years: ");
				y=sc.nextInt();
				System.out.println("Enter Employee Salary: ");
				sal=sc.nextFloat();
				FileWriter w1=new FileWriter("Employee.txt",true);
				w1.write("Employee Name: "+name+"\nEmployee Number:"+no+"\nEmployee Department: "+depart+"\nExperience in Years: "+y+"\nEmployee Salary:"+sal+"\n---\n");
				w1.close();
				System.out.println("Details entered into employee file");
			}
			if((fi2.createNewFile()||fi2.exists())&&(y>5)) {
				FileWriter w2=new FileWriter("Valid.txt",true);
				w2.write("Employee Name: "+name+"\nEmployee Number:"+no+"\nEmployee Department: "+depart+"\nExperience in Years: "+y+"\nEmployee Salary:"+sal+"\n---\n");
				w2.close();
				System.out.println("Details Entered into Valid file");
			}
			else if((fi3.createNewFile()||fi3.exists())&&(y<=5)) {
				FileWriter w3=new FileWriter("Invalid.txt",true);
				w3.write("Employee Name: "+name+"\nEmployee Number:"+no+"\nEmployee Department: "+depart+"\nExperience in Years: "+y+"\nEmployee Salary:"+sal+"\n---\n");
				w3.close();
				System.out.println("Details entered into invalid file");
			}
			else {
				System.out.println("No file");
			}
		}
		catch(Exception e) {
			System.out.println("Exception:"+e);
		}
	}
}
public class Emplo {
	public static void main(String args[]) {
		int nu;
		System.out.println("How many Employee Details want to add: ");
		Scanner sc=new Scanner(System.in);

		nu=sc.nextInt();
		Employee[] o=new Employee[nu];
		for(int i=0;i<nu;i++) {
			o[i]=new Employee();
			o[i].mEmplo();
		}
	}
}