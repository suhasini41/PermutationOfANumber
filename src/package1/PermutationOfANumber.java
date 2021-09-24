package package1;

public class PermutationOfANumber 
{
	public static void permutation(String n,String ans)
	{
		if(n.length()==0)
		{
			System.out.println(ans);
			return;
		}
		else
		{
			for(int i=0;i<n.length();i++)
			{
				char ch = n.charAt(i);
				String ros = n.substring(0,i)+n.substring(i+1);
				permutation(ros,ch+ans);
			}
		}
	}
	public static void printPermutations(int x)
	{
		String s = Integer.toString(x);
		permutation(s,"");
	}

	public static void main(String[] args) 
	{
		printPermutations(1234);

	}

}
