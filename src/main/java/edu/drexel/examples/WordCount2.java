package edu.drexel.examples;
import java.io.*; 
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.*; 




public class WordCount2 {
	
	static public void getWords(String input, Map<String, Integer> words) {
		
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
	
	
	public static void main(String[] args) { 
		File file = new File("/Users/user/Documents/gutenberg.txt"); //Put file path here 
		try ( BufferedReader br = new BufferedReader(new FileReader(file)); ) {

			Map<String, Integer> words = new HashMap<String, Integer>(); 
			String st; 
			while ((st = br.readLine()) != null) {
				getWords(st, words);
			}
			
			
			//Map<String, Float> map = new TreeMap<>(yourMap);
			
			//Set<String> keys = words.keySet();
			
			
			words.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey()).forEach(System.out::println);
			Map<String, Integer> sortedWords = words.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey()).collect( Collectors.toMap( e -> e.getKey() , e -> e.getValue()  ) );
			//			for(String key: keys)
//			{
//				System.out.println("Value of "+key+" is: "+ words.get(key));
//	        }
		}
		catch(IOException e) {
			System.out.println("Error : input a valid path and filename");
		}
		
	}
	

	
}
