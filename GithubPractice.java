import java.util.ArrayList;
public class GithubPractice{
	public static void main (String[]args){
		ArrayList <Integer> list1 = new ArrayList<>();
			for (int i = 0; i < 10; i ++)
				list1.add((int)(Math.random()*10)+1);
		ArrayList <Integer> list2 = new ArrayList<>();
			for (int i = 0; i < 10; i ++)
				list2.add((int)(Math.random()*10)+1);

		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+list2);
		System.out.print(combine (list1, list2));
		System.out.println("\n");
		numbersCommas(list1);
		System.out.println("\n");
		System.out.print(removeDuplicates(list1));
		System.out.println("\n");
	}

	public static ArrayList <Integer> combine (ArrayList <Integer> a, ArrayList <Integer> b){
		ArrayList <Integer> combined = new ArrayList<>();
		for (int i = 0; i < a.size(); i ++)
			combined.add(a.get(i));
		for (int i = 0; i < b.size(); i ++)
			combined.add(b.get(i));
		return combined;
	}

	public static void numbersCommas (ArrayList <Integer> a){
		for (int i = 0; i < a.size(); i ++){
			System.out.print(a.get(i));
			if (i < (a.size()-1))
				System.out.print(", ");
		}
	}

	public static ArrayList <Integer> removeDuplicates (ArrayList <Integer> a){
		for (int i = 0; i < a.size(); i ++){
			for (int j = i; j < a.size(); j ++){
				if (a.get(i)==a.get(j)){
					a.remove(i);
				}
			}
		}
		return a;
	}
}