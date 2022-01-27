package palindromesNotAllowed;
import java.util.*;

public class janCookoff {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-->0)
		{
		    int n=scn.nextInt();
		    
		      
		      String s="";
		      char cur='a';
		      
		      for(int i=0;i<n;i++)
		      {
		          s=s+cur;
		          cur++;
		          
		          if(cur=='d')
		          {
		              cur='a';
		          }
		      }
		    
		   
		    System.out.println(s);

	}
	}

}
