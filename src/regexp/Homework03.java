package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-04-12 17:05
 * 3.对一个url进行解析  http://www.sohu.com:8080/abc/index.htm
 * a)要求得到协议是什么?   http
 * b)域名是什么?          www.sohu.com
 * c) 端口是什么?         8080
 * d)文件名是什么?        index.htm
 */
public class Homework03
{
	public static void main(String[] args)
	{
		String content = "http://www.sohu.com:8080/abc/index.htm";
		String regStr = "^([a-zA-Z]+)://([a-zA-Z.]+):(\\d+)[\\w-/]*/([\\w.]+)$";

		Pattern p = Pattern.compile(regStr);
		Matcher m  = p.matcher(content);
		if (m.find())
		{
			System.out.println("协议: " + m.group(1));
			System.out.println("域名: " + m.group(2));
			System.out.println("端口号: " + m.group(3));
			System.out.println("文件名: " + m.group(4));
		}
		else
		{
			System.out.println("匹配失败");
		}
	}
}
