package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO 案例实战
 * @create 2022-04-11 20:34
 */
public class Regexp10
{
	public static void main(String[] args)
	{
		String content = "我....我要....学学学学....编程Java!";
		String regStr = "\\.";

		Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(content);

		String newContent = matcher.replaceAll("");
		System.out.println(newContent);
//
//		//使用(.)\\1+来查出重复的字
//		pattern = Pattern.compile("(.)\\1+");
//		matcher = pattern.matcher(newContent);
//
//		while (matcher.find())
//		{
//			System.out.println("find: " + matcher.group(0));
//		}
//
//		//用一个字符替换相同的字符
//		newContent = matcher.replaceAll("$1");

		//用一句话代替上诉语句.
		newContent = Pattern.compile("(.)\\1+").matcher(newContent).replaceAll("$1");
		System.out.println(newContent);
	}
}
