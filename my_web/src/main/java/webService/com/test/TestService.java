package webService.com.test;


/**
 * webservice服务
 * @author 李 民
 * @date 2017年4月21日 下午4:24:07
 */
public class TestService {

	private static final String s = "此信息由webservice服务端返回:";
	
	public String test(String msg){
		
		return s+msg;
	}
}
