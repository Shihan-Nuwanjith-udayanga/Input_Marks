import java.util.*;
class Input_marks{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input numbers of Students : ");
		final int N=input.nextInt();
		System.out.println();
		int[] marks=new int[N];
		for(int i=0; i<N; i++){
			System.out.print("Input No "+(i+1)+" Student Marks :");
			marks[i]=input.nextInt();
		}
		double total=0;
		for(int i=0; i<N; i++){
			total+=marks[i];
		}
		double average=total/N;
		double max=marks[0];
		for(int i=1; i<N; i++){
			if(marks[i]>max){
				max=marks[i];
			}
		}
		double min=marks[0];
		for(int i=1; i<N; i++){
			if(marks[i]<min){
				min=marks[i];
			}
		}
		
		System.out.println("\nTotal :"+total);
		System.out.println("Average :"+average);
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
	}
}
