package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-04-10 18:23
 */
public class Regexp06
{
	public static void main(String[] args)
	{
		String content = "123zbc 22zbc";
		//以一个数字开头后接若干个小写字母
//		String regStr = "^[0-9]+[a-z]*";
//		String regStr = "^[0-9]+[a-z]+$";
		String regStr = "zbc\\b";
		Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(content);

		while (matcher.find())
		{
			System.out.println("find: " + matcher.group(0));
		}
	}
}
