package util;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtil {
	
	/**
	 * 删除文本中的html标签
	 * @param htmlStr
	 * @return
	 */
	public static String delHTMLTag(String htmlStr){
		htmlStr=  htmlStr.replaceAll("&nbsp;", "");
        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式 
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式 
        String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式 
         
        Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE); 
        Matcher m_script=p_script.matcher(htmlStr); 
        htmlStr=m_script.replaceAll(""); //过滤script标签 
         
        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE); 
        Matcher m_style=p_style.matcher(htmlStr); 
        htmlStr=m_style.replaceAll(""); //过滤style标签 
         
        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE); 
        Matcher m_html=p_html.matcher(htmlStr); 
        htmlStr=m_html.replaceAll(""); //过滤html标签
       
       
        return htmlStr.trim(); //返回文本字符串 
    }
	
	/**
	 * v1：数组去重，使用集合
	 * 优点：有序
	 * 缺点：代码复杂
	 * @param oldArray
	 * @return
	 */
	public static String[] toSingle(String[] oldArray) {
	
		List<String> newArray = new ArrayList<String>();
		
		int length = oldArray.length;
		
		if(oldArray != null && length > 0) {
			for(String temp : oldArray) {
				try {
					for(String temp2 : newArray) {
						if(temp.equals(temp2)) {
							throw new ArithmeticException();
						}
					}
				} catch(ArithmeticException ex) {
					continue;
				}
				newArray.add(temp);
			}
		}
		String[] newArrayString = new String[newArray.size()];
		newArray.toArray(newArrayString);
		
		return newArrayString;
	}
	
	/**
	 * v2：数组去重：使用set集合
	 * 优点：代码简单
	 * 缺点：无序
	 * @param oldArray
	 * @return
	 */
	public static String[] toSingleSet(String[] oldArray) {
	
		Set<String> newArray = new HashSet<String>();
		
		int length = oldArray.length;
		
		if(oldArray != null && length > 0) {
			for(String temp : oldArray) {
				newArray.add(temp);
			}
		}
		String[] newArrayString = new String[newArray.size()];
		newArray.toArray(newArrayString);
		
		return newArrayString;
	}
	
	/**
	 * 
	 * 根据字符拼接数组
	 * @param oldArray
	 * @param character
	 * @return
	 */
	public static String arrayToString(String[] oldArray, String character) {
		StringBuilder newString = new StringBuilder();
		int length = oldArray.length;
		if(oldArray != null && length > 0) {
			for(int i = 0; i < length; i++) {
				if(i == 0) {
					newString.append(oldArray[i]);
				} else {
					newString.append(character);
					newString.append(oldArray[i]);
				}
			}
		}
		return newString.toString();
	}
	
	/**
	 * 取消科学计数法
	 * 例如： 100.00=> 100; 100.01=>100.01
	 * @param d
	 * @return
	 */
	public static String formatDouble(double d) {
        NumberFormat nf = NumberFormat.getInstance();
        //设置保留多少位小数
        nf.setMaximumFractionDigits(20);
         // 取消科学计数法
        nf.setGroupingUsed(false);
        //返回结果
        return nf.format(d);
    }

	/**
	 * 替换掉字符串中的非："数字"， "."， "-"  中的为空，在转换成数字
	 * 将字符串转化为数字
	 * @param value_string
	 * @return
	 */
	public static float stringToNumber(String value_string) {
		String value_string_re = "";
		if(value_string != null) {
			value_string_re = value_string.replaceAll("[^0-9.-]", "");
		}
		return Float.valueOf("".equals(value_string_re) ? "0" : value_string_re);
	}

}
