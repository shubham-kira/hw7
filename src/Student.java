import java.util.Scanner;


public class Student {
	String name[];
	float sub1[];
	float sub2[];
	float sub3[];
	float sub4[];
	float avg[];
	char grade[];
	int n;
	
	Student(int n){
		name = new String[n];
		sub1 = new float[n];
		sub2 = new float[n];
		sub3 = new float[n];
		sub4 = new float[n];
		avg = new float[n];
		grade = new char[n];
		this.n = n;
	}
	
	void input(int index) throws MyException, IndexException{
		if(index >= n) {
			throw new IndexException();
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name and marks");
			
		name[index] = input.next();
		try {
			sub1[index] = input.nextFloat();
			if(sub1[index]<0 || sub1[index]>100){
				throw new MyException();
			}
			sub2[index] = input.nextFloat();
			if(sub2[index]<0 || sub2[index]>100){
				throw new MyException();
			}
			sub3[index] = input.nextFloat();
			if(sub3[index]<0 || sub3[index]>100){
				throw new MyException();
			}
			sub4[index] = input.nextFloat();
			if(sub4[index]<0 || sub4[index]>100){
				throw new MyException();
			}
			}finally {
				input.close();
			}
			avg[index] = (sub1[index]+sub2[index]+sub3[index]+sub4[index])/4;
			if(avg[index]>90)
				grade[index] = 'A';
			else if(avg[index]>80)
				grade[index] = 'B';
			else if(avg[index]>70)
				grade[index] = 'C';
			else if(avg[index]>60)
				grade[index] = 'D';
			else
				grade[index] = 'F';

	}
	
	String getName(int index) throws IndexException{
		if(index >= n) {
			throw new IndexException();
		}
		return name[index];
	}
	float getAvg(int index) throws IndexException{
		if(index >= n) {
			throw new IndexException();
		}
		return avg[index];
	}
	char getGrade(int index) throws IndexException{
		if(index >= n) {
			throw new IndexException();
		}
		return grade[index];
	}
}
