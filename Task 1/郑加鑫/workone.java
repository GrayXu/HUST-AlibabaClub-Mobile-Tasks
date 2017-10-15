package workone;

public class workone  
{
	public static void main(String[] args)
	{
	  int i=1,k=1;
	  do
	  {
		  System.out.println(i);
		  System.out.println(k);
		  i=i+k;
		  k=i+k; 
	  }while(k<100);
	}

}
