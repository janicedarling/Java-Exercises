public class isPerm{
	public static void main(String[] args){
		System.out.println(isPerm("Hello", "olleH"));
	}

	public static boolean isPerm(String s1, String s2){
		if(s1.length()!= s2.length()){
			return false;
		}
	
		boolean c1[] = new boolean[128];
		boolean c2[] = new boolean[128];
	
		for(int i =0; i<s1.length(); i++){
			int v1 = s1.charAt(i);
			int v2 = s2.charAt(i);
			c1[v1] = true;
			c2[v2] = true;
		}
		
		for(int j=0; j<128; j++){
			if(c1[j] != c2[j]){
				return false;
			}
		}
		return true;
	}
/*This first approach fails on comparing strings with repeated characters because of the use of the ASCII values in a boolean array. For example "Hello" and "Heloo" returns true*/
}


/*

	public static boolean isPerm(String s1, String s2){
   		 if(s1.length() != s2.length()){
     			 return false;
  		}
    		return sort(s1).equals(sort(s2));
 	 }
  
 	 public static String sort(String s){
   		char [] c = s.toCharArray();
	        Arrays.sort(c);
   	        return new String(c);
    
 	 }	
*/
