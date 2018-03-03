import java.util.Scanner;

        class Palindrome{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        		System.out.println("Before Reverse :");
        		String original = s.next();
     		String reverse = "";
        
      	                     for(int i =(original.length()-1);i>=0;i--){
                                          		reverse = reverse + original.charAt(i);
            
          
        		}
         
       		 System.out.println("After Reverse :");
      		 System.out.println(reverse);
        
      		  if(original.equals(reverse)){
          			  System.out.println("The word " +"<<" + original + ">>"+ " is palimdrome" );
        		  }else{
           			 System.out.println("The word " +"<<" + original + ">>" + " is not a palimdrome" );
       		 }
	}
}     