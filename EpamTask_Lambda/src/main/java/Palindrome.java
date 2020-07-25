import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Palindrome {
	public static List<String> stringspalindrome(List<String> list,Function<String, Boolean> function){
		List<String> finallist = new ArrayList<>();
		for(String str: list) {
			if(function.apply(str))
				finallist.add(str);	
		}
		return finallist;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		String arr[]= new String[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.next();
		List<String> list_one = Arrays.asList(arr);
		List<String> Finallist = stringspalindrome(list_one,(String str)-> (new StringBuffer(str).reverse().toString().equals(str)));
		System.out.println(Finallist);
		sc.close();
	}
	
}
