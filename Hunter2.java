

	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.Scanner;

	public class Hunter2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sin=new Scanner(System.in);
		System.out.println("Ente the string : ");	
		String input=sin.nextLine();
		char [] arr=input.toCharArray();
		LinkedHashSet<Character> dup=new LinkedHashSet<Character>();
		for(int i=0;i<arr.length;i++)
		{
			dup.add(arr[i]);
		}
		String res="";
		Iterator<Character> it=dup.iterator();
		while(it.hasNext())
		{
			res += it.next();
		}
		System.out.println("String after removing duplicates : ");
		System.out.println(res);
		sin.close();
		}

	
}
