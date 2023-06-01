package AAA;

public class Run {

	public static void main(String[] args) 
	{
		String str="bangalore";
		while (str.length()!=0)
		{
			char ch=str.charAt(0);
			int count=0;
			int srch=0;
			while(str.indexOf(ch,srch)!=-1)
			{
				count++;
				srch = str.indexOf(ch,srch)+1;
			}
			System.out.println(ch+":" + count);
			str=str.replaceAll (Character.toString(ch),"");
	}
	}
}
