package com.limin.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;



/**
 * 注册验证 类
 * @author limin
 *
 */
public class Regex {
	 
	
	/**
	 * 银行卡号验证
	 * @author limin 2015年12月15日
	 * @param bank_num
	 * @return
	 */
	public static boolean checkBankNum(String bank_num) {
		if(StringUtils.isBlank(bank_num))
			return false;
		String reg = "^\\d{16}|\\d{19}$";
		boolean result = bank_num.matches(reg);
		if(result){
			//LUHN算法验证
			result = yzBankNum(bank_num);
		}
		
		
		return result;
	}
	
	/**
	 * LUHN 算法 验证卡号
	 * @author limin 2015年12月15日
	 * @param code
	 * @return
	 */
	private static boolean yzBankNum(String code){
		char[] ch = code.toCharArray();
		int total = 0;
		for(int i=ch.length-1,j=1;i>=0;i--,j++){
			int k = ch[i]-'0';
			if(j%2==0){
				k *= 2;
				k =  k%10+k/10;
			}
			total += k;
		}
		if(total>0){
			return total%10==0?true:false;
		}
		return false;
	}
	
	/**
	 * 用户名验证
	 * @param username
	 * @return
	 */
	public static boolean checkUsername(String username) { 
		if(StringUtils.isBlank(username))
			return false;
		return username.matches("(?i)^[a-z]{1}[a-zA-Z0-9_-]{5,19}$"); 
	} 
	
	
	/**
	 * 检查email
	 * @param email
	 * @return
	 */
	public static boolean checkEmail(String email){
		if(StringUtils.isBlank(email))
			return false;
		String reg = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
		
		return email.matches(reg);
	}
	
	
	/**
	 * 验证密码：不少于6位
	 * @param password
	 * @return
	 */
	public static boolean checkPwd(String password) { 
		if(StringUtils.isBlank(password))
			return false;
		return password.matches("^[_0-9a-zA-Z-]{6,20}$"); 
	} 
	
	
	/**
	 * 验证真实姓名：中文名或英文名
	 * @param name
	 * @return
	 */
	public static boolean checkRealName(String name){
		if(StringUtils.isBlank(name))
			return false;
		String reg1 = "^[\u3400-\uFE4F]{2,20}$";
		String reg2 = "^[a-zA-Z]{6,20}$";
		return name.matches(reg1) || name.matches(reg2);
	}
	
	
	/**
	 * 验证身份证
	 * @param sfid
	 * @return
	 */
	public static boolean checkSfid(String sfid){
		if(StringUtils.isBlank(sfid))
			return false;
		String reg = "^(\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$";
	        //香港
		String regHK = "^[A-Z]{1}[0-9]{6}\\(([0-9]{1}|A)\\)$";
	        //澳门
	        String regM = "^[1-9]{1}[0-9]{6}\\([0-9]{1}\\)$";
	        //台湾
	        String regTW = "^[A-Z]{1}[0-9]{9}$";
		return sfid.matches(reg) || sfid.matches(regHK) || sfid.matches(regM) || sfid.matches(regTW);
	}

	
	/**
	 * 微信号验证
	 * @param weixin
	 * @return
	 */
	public static boolean checkWeiXin(String weixin) {
		if(StringUtils.isBlank(weixin))
			return false;
		return weixin.matches("(?i)^[a-zA-Z]{1}[_0-9a-zA-Z-]{5,19}$");
	}
	
	
	public static boolean checkWeixinName(String weixinname){
		if(StringUtils.isBlank(weixinname))
			return false;
		return (weixinname.length()>=1&&weixinname.length()<=50)?true:false;
	}
	/**
	 * 邀请码验证
	 * @param code
	 * @return
	 */
	public static boolean checkCode(String code){
		if(StringUtils.isBlank(code))
			return false;
		return code.matches("^[0-9A-Z]{12}$");
	}


	/**
	 * QQ号验证
	 * @param qq
	 * @return
	 */
	public static boolean checkQq(String qq) {
		if(StringUtils.isBlank(qq))
			return false;
		return qq.matches("^\\d{5,12}$");
	}
	
	
	/**
	 * 网店链接验证
	 * @param url
	 * @return
	 */
	public static boolean checkWebURL(String url){
		if(StringUtils.isBlank(url))
			return false;
		return url.matches("(?i)^((http|https)://){0,1}([A-Za-z0-9-_]+)\\.((taobao\\.com)|(tmall\\.com))(/){0,1}$");
	}
	
	/**
	 * 旺旺号
	 * @param wangwang
	 * @return
	 */
	public static boolean checkWangwang(String wangwang){
		if(StringUtils.isBlank(wangwang))
			return false;
		int len = 0;
		for (int i = 0; i < wangwang.length(); i++) {
	               int length = wangwang.codePointAt(i);
	               if(length>=0&&length<=128){
	                    len += 1;
	                }else{
	                    len += 2;
	                }
                }
		if(len>=5&&len<=25){
			return true;
		}
		return false;
	}
	
	
	/**
	 * 淘宝名验证
	 * @param taobaoname
	 * @return
	 */
	public static boolean checkTaobaoName(String taobaoname){
		if(taobaoname!=null&&!taobaoname.isEmpty()){
			boolean flag = taobaoname.length()>=3 && taobaoname.length()<=30;
			return flag;
		}
		return false;
	}
	
	
	/**
	 * 手机验证码验证
	 * @param yzm
	 * @return
	 */
	public static boolean checkYzm(String yzm){
		if(StringUtils.isBlank(yzm))
			return false;
		String reg = "^\\d{6}$";
		return yzm.matches(reg);
	}
	
	
	/**
	 * 图片验证码验证
	 * @author limin 2016年8月10日
	 * @param authImg
	 * @return boolean
	 */
	public static boolean checkImgAuth(String authImg){
		if(StringUtils.isBlank(authImg))
			return false;
		String reg = "^[0-9a-zA-Z]{4}$";
		return authImg.matches(reg);
	}
	
	
	/**
	 * 较验时间正则 年月日
	 * @param value
	 * @return
	 */
	public static boolean chechTimeYM(String  value){
		if(StringUtils.isBlank(value))
			return false;
		Pattern p = Pattern.compile("^[1|2]{1}\\d{3}-[0|1]{1}[0-9]{1}$"); 
		return p.matcher(value).matches();
	}
	
	
	/**
	 * 较验时间正则 年月日
	 * @param value
	 * @return
	 */
	public static boolean chechTimeYMD(String  value){
		if(StringUtils.isBlank(value))
			return false;
		Pattern p = Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\-\\s]?((((0?" +"[13578])|(1[02]))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))" +"|(((0?[469])|(11))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(30)))|" +"(0?2[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][12" +"35679])|([13579][01345789]))[\\-\\-\\s]?((((0?[13578])|(1[02]))" +"[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))" +"[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\-\\s]?((0?[" +"1-9])|(1[0-9])|(2[0-8]))))))"); 
		return p.matcher(value).matches();
	}
	
	/**
	 * 较验时间正则 年月日时分秒
	 * @param value
	 * @return
	 */
	public static boolean chechTimeYMDHMS(String  value){
		if(StringUtils.isBlank(value))
			return false;
		Pattern p = Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$"); 
		
		return p.matcher(value).matches();
	}
	
	/**
	 * 判断是否是格式为  yyyy-mm-dd HH:mm:ss
	 * @return
	 */
	public static boolean isDate(String datetime) {
		if(StringUtils.isBlank(datetime))
			return false;
	    String datePattern = "^(\\d{4})\\-((\\d{2})|(\\d{1}))\\-((\\d{1})|(\\d{2})) (\\d{2}):(\\d{2}):(\\d{2})$";
            Pattern pattern = Pattern.compile(datePattern);
            Matcher matcher = pattern.matcher(datetime);
            return matcher.matches();
	}
	
	/**
	 * 判断是否是格式为  yyyy-mm-dd 
	 * @return
	 */
	public static boolean isShortDate(String datetime) {
		if(StringUtils.isBlank(datetime))
			return false;
	    String datePattern = "^(\\d{4})\\-((\\d{2})|(\\d{1}))\\-((\\d{1})|(\\d{2}))$";
            Pattern pattern = Pattern.compile(datePattern);
            Matcher matcher = pattern.matcher(datetime);
            return matcher.matches();
	}
	
	
	/**
	 * 检验是否是 纯数字
	 * @param value
	 * @return
	 */
	public static boolean checkIsNumber(String value){
		if(StringUtils.isBlank(value))
			return false;
		Pattern p=Pattern.compile("^[0-9]*$");
		return p.matcher(value).matches();
	}
	
	
	/**
	 * 验证手机号
	 * @param mobile
	 * @return
	 */
	public static boolean checkMobile(String mobile) {
		if(StringUtils.isBlank(mobile))
			return false;
		//"^((1[3|4|5|8][0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$"
		Pattern pattern = Pattern.compile("^1(3|4|5|7|8)\\d{9}$");
		Matcher matcher = pattern.matcher(mobile);
		return matcher.matches();
        }
	
	
	/**
	 * update by wuyong (修改授权码验证)
	 * 验证授权编号
	 * @param shouquan
	 * @return
	 */
	public static boolean checkShouquan(String shouquan) {
		if(StringUtils.isBlank(shouquan))
			return false;
		Pattern pattern = Pattern.compile("^[a-z0-9]{16,19}$");
		Matcher matcher = pattern.matcher(shouquan);
	        return matcher.matches();
        }
	
	
	/**
	 * url正则校验
	 * @param url
	 * @return
	 */
	public static boolean checkUrl(String url){
		if(StringUtils.isBlank(url))
			return false;
		Pattern p = Pattern.compile("^(https|http|www|ftp|)?(://)?(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*((:\\d+)?)(/(\\w+(-\\w+)*))*(\\.?(\\w)*)(\\?)?(((\\w*%)*(\\w*\\?)*(\\w*:)*(\\w*\\+)*(\\w*\\.)*(\\w*&)*(\\w*-)*(\\w*=)*(\\w*%)*(\\w*\\?)*(\\w*:)*(\\w*\\+)*(\\w*\\.)*(\\w*&)*(\\w*-)*(\\w*=)*)*(\\w*)*)$",Pattern.CASE_INSENSITIVE );   
		Matcher m = p.matcher(url);    
		return m.matches();
	}
	
	
	/**
	 * 金额正则验证(带长度限制)
	 * @param money 0.00
	 * @param size 长度
	 * @return
	 */
	public static boolean checkMoney(String money,int size){
		if(StringUtils.isBlank(money))
			return false;
		if(size<1){
			return false;
		}
		//主要对小数点前位数判断
		int i = money.indexOf(".");
		if(i<1){
			return false;
		}//金额最高位
		else if(money.substring(0,i).length()>size){
			//判断是不是数字
			return checkMoney(money);
		}else{
			return false;
		}        
	}
	
	/**
	 * 金额正则验证（注，只允许两位小数）
	 * @param money 0.00
	 * @return
	 */
	public static boolean checkMoney(String money){
		if(StringUtils.isBlank(money))
			return false;
		//主要对小数点前位数判断
		int i = money.indexOf(".");
		//不带小数点
		if(i==-1){
			return checkIsNumber(money);
		//点在开头或在结尾的情况
		}else if (i==0||i==(money.length()-1)){
			return false;
		}else{
			//前半部分
			String firststring = money.substring(0,i);
			//后半部分
			String laststring = money.substring(i+1,money.length());
			//只有两位小数
			if(laststring.length()<3&&checkIsNumber(firststring)&&checkIsNumber(laststring)){
				return true;
			}else{
				return false;
			}
		}
	}
	
	//测试用例
	public static void main(String[] args) {
		System.out.println(chechTimeYM("2016-15"));
		
//		String s = "00000000001";
//		int i = s.indexOf(".");
//		System.out.println(s.substring(i+1,s.length()));
		//String substring = s.substring(0, i);
		//System.out.println(substring.length()+"substring.leng");
	//	System.out.println(substring+"=substring");
		//System.out.println(i+"=i");
/*		String s1 = "0.000";
		String s2 = "0.011111";
		String s3 = "1";
		String s4 = "1.50";
		String s5 = "000001.00";
		String s6 = "1.0";
		String s7 = "10000000000000";
		String s8 = "1fdsfafa.sdsdf00";
		String s9 = ".00";
		String s10 = "00.";
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(s);
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);
		arrayList.add(s6);
		arrayList.add(s7);
		arrayList.add(s8);
		arrayList.add(s9);
		arrayList.add(s10);
		for (String string : arrayList) {
			test(string);
		}*/
		
	}
	
	public static void test(String s){
		if(checkMoney(s)){
			System.out.println(s+"通过了checkMoney判定---OK");
		}else{
			System.out.println(s+"没通过checkMoney判定---NO");
		}
		
	}

}
