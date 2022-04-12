package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-04-10 12:27
 */
public class Regexp
{
	public static void main(String[] args)
	{
		String content = "2011年7月，JetBrains推出Kotlin项目，这是一个面向JVM的新语言 [3]  ，" +
				"它已被开发一年之久。JetBrains负责人Dmitry Jemerov说，大多数语言没有他们正在寻找的特性，" +
				"Scala除外。但是，他指出了Scala的编译时间慢这一明显缺陷。Kotlin的既定目标之一是像Java一样快速编译。" +
				" [2]  2012年2月，JetBrains以Apache 2许可证开源此项目。 [3] \n" +
				"Jetbrains希望这个新语言能够推动IntelliJ IDEA的销售。 [4] \n" +
				"Kotlin v1.0于2016年2月15日发布。这被认为是第一个官方稳定版本，并且JetBrains已准备从该版本开始的长期向后兼容性。 [3] \n" +
				"在Google I/O 2017中，Google宣布在Android上为Kotlin提供一等支持。";
		//Pattern pattern = Pattern.compile("[a-zA-Z]+");
		//Pattern pattern = Pattern.compile("[0-9]+");
		Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]+");
		Matcher matcher = pattern.matcher(content);
		while (matcher.find())
		{
			System.out.println("找到: " + matcher.group(0));
		}
	}
}
