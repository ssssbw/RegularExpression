package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO 演示字符匹配符
 * @create 2022-04-10 16:13
 */
public class Regexp03
{
	public static void main(String[] args)
	{
		String content = "a11c8  abc ABC";
		//String regStr = "[a-z]";
		//String regStr = "[A-Z]";
		//String regStr = "(?i)abc";//不区分大小写,默认是区分的
		//String regStr = "abc";//加了CASE_INSENSITIVE
		//String regStr = "[0-9]";
		//String regStr = "[^a-z]";
		//String regStr = "[abcd]";//匹配其中的任一字符
		//String regStr = "\\D";
//		String regStr = "\\w";//字母,数字,下划线
		//String regStr = "\\s";
		String regStr = ".";

		Pattern pattern = Pattern.compile(regStr);/*,Pattern.CASE_INSENSITIVE*/
		Matcher matcher = pattern.matcher(content);
		while (matcher.find())
		{
			System.out.println("find: " + matcher.group(0));
		}
	}
}
