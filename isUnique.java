public class isUnique{
	public static void main(String[] args){
		System.out.print(isUnique("Hello"));
	}

	public static boolean isUnique(Sting s){
		if(s.length() > 128){
			return false;
		}

		boolean[] c = new boolean[128];
		for(int i=0; i<s.length(); i++){
			int val = s.charAt(i);
			if(c[val]){
				return false;
			}
			c[val] = true;
		}
		return true;
	}
}
