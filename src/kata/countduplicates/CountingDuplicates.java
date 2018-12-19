package kata.countduplicates;

import java.util.HashSet;

public class CountingDuplicates {
	  public static int duplicateCount(String text) {
		  
		  text = text.toLowerCase();
		  System.out.println(text);
		  HashSet<String> set = new HashSet<String>();
		  
		  
		  for (int i = 0; i<text.length()-1; i++) {
			  for (int j=i+1; j<text.length(); j++) {
				  if (text.charAt(i) == text.charAt(j)) {
				  		System.out.println(("MATCH " + i + "_" + j));
				  		set.add(String.valueOf(text.charAt(i)));
				  		break;
				  }
					  
			  }
			  
		  }
		  
		  System.out.println("# of duplicate letters: " + set.size());
		  return set.size();
	  }
}
