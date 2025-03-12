
public class evil_number {

	public static void main(String[] args) {
      int input=7,rem=0,add=0;
      int squre=input*input;
      for(;squre>0;squre/=10)
      {
    	  rem=squre%10;
    	  add=add+rem;
      }
      if (input==add)
      {
    	  System.out.println("NUMBER IS A EVIL");
    	  
      }
      else System.out.println("NOT EVIL");
	}

}
