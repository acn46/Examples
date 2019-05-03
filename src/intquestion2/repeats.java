package intquestion2;
import java.util.*;

public class repeats {

	static public int getTime(List<Integer> arr, int position) {
		
		List<Integer> queuelist = arr.subList(1, arr.size() - 1);
		
		int timeSpent = 0;
		int cycle = 0;
		int lsize = queuelist.size();
		System.out.println(queuelist);
		
		while (queuelist.get(position) != 0) {
			
			for (int i = 0; i < lsize; i++) {
				
				if (queuelist.get(position) != 0 && queuelist.get(i) != 0) {
					timeSpent = timeSpent + 1;
					queuelist.set(i, queuelist.get(i) -1 );	
				}
				System.out.println(queuelist);
			}
			
		}
		
		return timeSpent;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> q1 = new ArrayList<>(Arrays.asList(5, 2, 6, 3, 4, 5, 2));
		List<Integer> q2 = new ArrayList<>(Arrays.asList(4, 1, 1, 1, 1, 0));
		List<Integer> q3 = new ArrayList<>(Arrays.asList(4, 5, 5, 2, 3, 3));

		System.out.println(getTime(q1, 2));
		System.out.println(getTime(q2, 0));
		System.out.println(getTime(q3, 3));

}

}