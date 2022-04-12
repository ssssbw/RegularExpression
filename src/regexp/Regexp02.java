package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-04-10 16:00
 */
public class Regexp02
{
	public static void main(String[] args)
	{
		String str = "abc$(abc(123(";
		//匹配(
		String regStr = "\\(";
		Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(str);
		while (matcher.find())
		{
			System.out.println("find: " + matcher.group(0));
		}
	}
}
