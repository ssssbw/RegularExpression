package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO 正则限定符的演示
 * @create 2022-04-10 17:35
 */
public class Regexp05
{
	public static void main(String[] args)
	{
		//Java默认贪婪匹配
		String content = "11aaaa111bb234";
//		String regStr = "a{3}";
//		String regStr = "1{3}";
//		String regStr = "\\d{3}";
//		String regStr = "\\w{2,3}";
//		String regStr = "[12ab]{2,3}";
//		String regStr = "1+";
//		String regStr = "\\D+";
		String regStr = "11a?";

		Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(content);

		while (matcher.find())
		{
			System.out.println("find: " + matcher.group(0));
		}
	}
}
