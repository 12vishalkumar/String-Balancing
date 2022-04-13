import java.util.*;
class ptc
{
	public static boolean StringBalanced(String str, char open, char close)
    {
        Stack<String> stck = new Stack<String>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == close)
            {
                if(!stck.empty())
                    stck.pop();
                else
                    return false;
            }
            if(ch == open)
            {
                stck.push(String.valueOf(ch));
            }
        }
        return stck.empty();
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext())
        {
			String input=sc.next();
            //Complete the code 
            System.out.println(StringBalanced(input, '{', '}') && StringBalanced(input, '(', ')') && StringBalanced(input, '[', ']'));
		}
		
	}
}
