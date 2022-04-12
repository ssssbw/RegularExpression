package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-04-12 14:59
 * 要求:1.只能有一个@
 *     2.@前面是用户名,可以是0-9a-zA-Z_-字符
 *     3.@后面是域名,域名只能是英文字母,比如sohu.com, tsinghua.org.cn
 *     4.写出正则表达式
 */
public class Homework01
{
	public static void main(String[] args)
	{

		String content = "3078619230@tsinghua.org.cn";
		String regStr = "^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";

		//Pattern pattern = Pattern.compile(regStr);
		//Matcher matcher = pattern.matcher(content);

		System.out.println(content.matches(regStr));
	}
}
