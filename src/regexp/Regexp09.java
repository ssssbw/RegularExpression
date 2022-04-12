package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO 反向引用
 * @create 2022-04-11 19:44
 */
public class Regexp09
{
	public static void main(String[] args)
	{
		String content = "12345-111222333";
		//String regStr = "(\\d)(\\d)\\2\\1";
		//要求前面是五位数,然后一个杠,然后3个连续三位数,形如:12345-111222333   "1551 5225 3443"
		String regStr = "\\d{5}[-](\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";

		Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(content);

		while (matcher.find())
		{
			System.out.println("find: " + matcher.group(0));
		}
	}
}
