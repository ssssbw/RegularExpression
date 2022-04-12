package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO 选择匹配符的演示
 * @create 2022-04-10 16:49
 */
public class Regexp04
{
	public static void main(String[] args)
	{
		String content = "zhuxiaowen 大帅比 朱孝文";
		String regStr = "zhu|朱|帅";

		Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(content);
		while (matcher.find())
		{
			System.out.println("find: " + matcher.group(0));
		}

	}
}
