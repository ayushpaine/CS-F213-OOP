import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;   

public class Test {
	
	public static void take_input(Person list[],int n)
	{
		
		Scanner sc=new Scanner(System.in);
		
		String name;
		int age;
		String id;
		String birthday;
		
		
		
		
		for(int i=0;i<n;i++)
		{
			
			
//			
//			
			System.out.println(" ");
			System.out.print("Enter Name: ");
			name=sc.nextLine();
			System.out.print("Enter ID: ");
			id=sc.nextLine();
			System.out.print("Enter Age: ");
			age=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Birthday (DD/MM) : ");
			birthday=sc.nextLine();
			
			
			
			Person P = new Person(name,id,age,birthday);
			list[i]=P;

			
			
		}
		
				
		
	}
	
	
	public static void find_person(Person list[],int n,String Today)
	{
		
		
		for(int i=0;i<n;i++)
		{
			if(list[i].Birthday.equals(Today))
			{
				
				System.out.println("Happy B'Day "+ list[i].name+"\n");
				System.out.println("Age has been increased from "+ list[i].age+" to "+ ++list[i].age+"\n");
				
			}
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of users: ");
		int n = sc.nextInt();
		Person[] list = new Person[n];
		take_input(list,n);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");  
	    Date date = new Date();  
	    String Today=formatter.format(date);
	    
	    find_person(list,n,Today);
	    
	    
		
		
		
		
		
	}

}
