
import java.time.LocalDate;
import java.util.*;
import java.io.*;
class Design{
	Scanner sc=new Scanner(System.in);
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	public void design() {
		int n;
		System.out.println("How many products: ");
		n=sc.nextInt();
		String[] productname=new String[n];
		float[] price=new float[n];
		int[] quantity=new int[n];
		float[] amount=new float[n];
		float totalamount=0;
		LocalDate date=LocalDate.now();
		Random ran=new Random();
		int invoiceno =ran.nextInt(10000);
		for(int i=0;i<n;i++) {
			System.out.println("Enter Product Name: ");
			try {
			productname[i]=b.readLine();
			} catch (IOException e) {
			System.out.println(e);
			}
			System.out.println("Enter Price of the Product: ");
			price[i]=sc.nextFloat();
			System.out.println("Enter Quantity or Number of Items: ");
			quantity[i]=sc.nextInt();
			}
			System.out.println("\t-------------------------------------------------------------------------------");
			System.out.println("\t\t\t\t\tABC Textile Shop\t\t\t");
			System.out.println("\t-------------------------------------------------------------------------------");
			System.out.println("Invoice No. :"+invoiceno);
			System.out.println("Date: "+date+"\n");
			System.out.println("Sl.No\tProduct Name\t\t\t\t\t\tPrice\t\t\tQuantity\tAmount (RS.)");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			for(int j=0;j<n;j++) {
			amount[j]=quantity[j]*price[j];
			System.out.print(j+1+"\t");
			System.out.printf("%-25s", productname[j]);
			System.out.println("\t\t\t\t"+price[j]+"\t\t\t"+quantity[j]+"\t\t"+amount[j]);
			totalamount=amount[j]+totalamount;
			}
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\t\t\t\t\t\t\t\t\tTotal Amount (Rs.): \t\t\t"+totalamount);
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		}
	}
	public class InvoiceDesign {
		public static void main(String re[]) {
			Design d=new Design();
			d.design();
		}
	}	