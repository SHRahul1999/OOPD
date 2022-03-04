//Composite Pattern Main Class

public class CompositePatternMain {
	public static void main(String args[]) {
		Employee e1=new SoftwareEngineer(2,"Andri(SE)",1000);
		Employee e2=new TestEngineer(3,"Baymax(TE)",2000);
		Employee e3=new Accountant(2,"Canon(Acc)",3000);
		Employee e4=new Cashier(3,"Denis(Ca)",4000);
		Employee pm1=new ProjectManager(1,"Epson(PM)",50000);
		Employee bl1=new BusinessLead(1,"Falco(BL)",60000);

		pm1.add(e1);
		pm1.add(e2);
		bl1.add(e3);
		bl1.add(e4);
		pm1.print();
		bl1.print();
	}
}
