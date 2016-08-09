public class URLify{

     public static void main(String []args){
        System.out.println(urlify("My dog"));
     }
     
     public static String urlify(String s){
         int count =0;
         for(int i = 0; i< s.length(); i++){
             if(s.charAt(i) == ' '){
                 count +=1;
             }
         }
         int clen = s.length() + (count*2);
         char[] c = new char[clen];
         int inc = 0;
         for(int j=0; j<s.length(); j++){
             if(s.charAt(j) == ' '){
                 c[inc] = '%';
                 c[inc+1] = '2';
                 c[inc+2] = '0';
                 inc += 3;
             }
             else{
                 c[inc++] = s.charAt(j);
             }
         }
         String k = new String(c);
         return k;
     }
}
