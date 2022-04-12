package regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-04-11 9:26
 */
public class Regexp08
{
	public static void main(String[] args)
	{
		//Scanner scanner = new Scanner(System.in);
		//String content = scanner.next();
		String url = "https://www.bilibili.com/video/BV1Eq4y1E79W?p=18&spm_id_from=pageDriver";
		//匹配汉字
		String regStr = "^[\u0391-\uffe5]+$";
		//匹配邮政编码 "[1-9]+?[0-9]{5}" 不够好
		String regStr1 = "^[1-9]\\d{5}$";
		//QQ号码 "[1-9]{5,10}" 不好
		String regStr2 = "^[1-9]\\d{4,9}$";
		//手机号码
		String regStr3 = "^1(?:3|4|5|8)[0-9]{9}";
		//域名验证 https://www.bilibili.com/video/BV1Eq4y1E79W?p=18&spm_id_from=pageDriver
		String regStr4 = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-=&%/_#?.]*)?$";

		Pattern pattern = Pattern.compile(regStr4);
		Matcher matcher = pattern.matcher(url);
		if(matcher.find())
		{
			System.out.println("格式正确");
		}
		else
		{
			System.out.println("格式不正确");
		}
	}
}
