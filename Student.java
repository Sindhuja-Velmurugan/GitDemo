package Day_01;
import java.util.Scanner;
public class Student {
	
	//Java code to calculate the Total and Average marks for four different Students
	
	int English;
	int Maths;
	int Social;
	int Science;
	int Total;
	int Average;
	
	public int TotalMarks() {
		
		Total = English + Maths + Social + Science ;
		System.out.println("Total Mark : "+ Total);
		return Total;
		 
	}
	
	public int AverageMarks() {
		
		Average = (English + Maths + Social + Science)/4 ;
		System.out.println("Average Mark :"+ Average);
		return Average;
	}

	public static void main(String[] args) {
		
				
		System.out.println("*************************************************************");
		//Object creation for First Student
		Student Stu1 = new Student();
		Stu1.English = 99;
		Stu1.Maths = 100;
		Stu1.Social= 92;
		Stu1.Science= 95;
		System.out.println("First Student:");
		Stu1.TotalMarks();
		Stu1.AverageMarks();
		System.out.println("*************************************************************");
		
		
		//Object creation for Second Student
		Student Stu2 = new Student();
		Stu2.English = 100;
		Stu2.Maths = 100;
		Stu2.Social= 100;
		Stu2.Science= 100;
		System.out.println("Second Student:");
		Stu2.TotalMarks();
		Stu2.AverageMarks();
		System.out.println("*************************************************************");
		
		
		//Object creation for Third Student
		Student Stu3 = new Student();
		Stu3.English = 86;
		Stu3.Maths = 98;
		Stu3.Social= 75;
		Stu3.Science= 83;
		System.out.println("Third Student:");
		Stu3.TotalMarks();
		Stu3.AverageMarks();
		System.out.println("*************************************************************");
		

		//Object creation for Fourth Student
		Student Stu4 = new Student();
		Stu4.English = 80;
		Stu4.Maths = 78;
		Stu4.Social= 80;
		Stu4.Science= 81;
		System.out.println("Fourth Student:");
		Stu4.TotalMarks();
		Stu4.AverageMarks();
		System.out.println("*************************************************************");
		
		//Exploring scanner option in java to give data input via console
		System.out.println("Exploring Scanner option in java");
				
		int Subject1;
		int Subject2;
		int Subject3;
		int Subject4;
		int Sum;
		int Avg;
		try (Scanner sr = new Scanner(System.in)) {
			System.out.println("Enter Subject1: ");
			Subject1 = sr.nextInt();
			System.out.println("Enter Subject2: ");
			Subject2 = sr.nextInt();
			System.out.println("Enter Subject3 : ");
			Subject3 = sr.nextInt();
			System.out.println("Enter Subject4 : ");
			Subject4 = sr.nextInt();
		}
		Sum = Subject1 + Subject2 + Subject3 + Subject4;
		Avg = Sum / 4;
		System.out.println("Sum is : "+Sum);
		System.out.println("Avg is : "+Avg);
					
	}
}
