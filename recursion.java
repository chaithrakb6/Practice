package Chaithra;

public class recursion {
	
	static int rangeoffact(int no)
	
	{  
		if(no==1)
			return 1;
		return no*rangeoffact(no-1);
		
	}
	
	public static void main(String[] args) {
		
		int range=10;
		for(int i=1;i<range;i++)
		{
			System.out.println(rangeoffact(i));
		}
		// TODO Auto-generated method stub

	}

	
}
