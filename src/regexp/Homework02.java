package regexp;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-04-12 16:31
 * 要求:1.验证是不是整数或小数
 *     2.这个题要考虑是正数负数
 */
public class Homework02
{
	public static void main(String[] args)
	{
			String content = "00.89";
			String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";

			if(content.matches(regStr))
			{
				System.out.println("整数或小数");
			}
			else
			{
				System.out.println("匹配失败");
			}
	}
}
