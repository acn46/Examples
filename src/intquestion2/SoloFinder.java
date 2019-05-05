package intquestion2;
import java.util.*; 
import java.util.Map;
import java.util.Hashtable;

public class SoloFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = { 2, 6, 6, 2, 4, 1, 4 };
		
		Map<String, Integer> numCounts = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if ( numCounts.containsKey( Integer.toString(a[i]) )  == Boolean.TRUE) {
				int count = numCounts.get( Integer.toString(a[i]) );
				numCounts.put( Integer.toString(a[i]), ++count);
			} else {
				numCounts.put( Integer.toString(a[i]), 1);
			}
			//System.out.println(a.length);
			System.out.println(numCounts);
		}
		
        Set<String> keys = numCounts.keySet();
		for(String key: keys)
		{
			if (numCounts.get(key) < 2) {
	            System.out.println( key + " does not have a pair" );
			}
            //System.out.println("Value of "+key+" is: "+ numCounts.get(key));
        }
			

	}

}
