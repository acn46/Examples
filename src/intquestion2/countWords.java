package intquestion2;
import java.io.*; 
import java.util.HashMap;
import java.util.Set;



public class countWords {
	
	static public void getWords(String input, HashMap<String, Integer> words) {
		
	    String[] wordarray = input.split("\\s+");
	    for (int i = 0; i < wordarray.length; i++) {
	    	if (words.containsKey(wordarray[i])) {
				int count = words.get( wordarray[i] );
				words.put( wordarray[i], ++count );
	    	} else {
	    		words.put( wordarray[i], 1 );
	    	}
	    }
		
	}
	
	
	public static void main(String[] args) throws IOException { 
		
		try {
			File file = new File("C:\\Users\\Home\\Downloads\\gutenberg.txt"); //Put file path here 
			BufferedReader br = new BufferedReader(new FileReader(file)); 	
			HashMap<String, Integer> words = new HashMap<String, Integer>(); 
			
			String st; 
			while ((st = br.readLine()) != null) {
				getWords(st, words);
			}
			
			br.close();
			
			//Map<String, Float> map = new TreeMap<>(yourMap);
			
			Set<String> keys = words.keySet();
			for(String key: keys)
			{
				System.out.println("Value of "+key+" is: "+ words.get(key));
	        }
		}
		catch(IOException e) {
			System.out.println("Error : input a valid path and filename");
		}
		
	}
	

	
}
