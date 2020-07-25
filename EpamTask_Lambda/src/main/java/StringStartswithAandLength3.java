import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class StringStartswithAandLength3 {
	
	public static List<String> StringsWithAandLength3(List<String> Slist, Predicate<String> predicate){
		List<String> ResultString = new ArrayList<>();
		for(String s: Slist) {
			if(predicate.test(s)&& s.startsWith("a")) {
				ResultString.add(s);
			}
		}
		return ResultString;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] arr= new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		List<String> list1 = Arrays.asList(arr);
		System.out.println(StringsWithAandLength3(list1,(String str)-> str.length()==3));
		sc.close();
	}
	
}
