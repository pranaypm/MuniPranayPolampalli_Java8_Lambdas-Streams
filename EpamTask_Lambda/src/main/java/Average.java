import java.util.Scanner;

public class Average {
	public int findingAverage(int arr[]) {
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		return sum/arr.length;
	}

		
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Average ag=new Average();
		int size=sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The average is : "+ag.findingAverage(arr));
		sc.close();
	}

}
