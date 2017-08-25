package webService.com.test;

@javax.jws.WebService(targetNamespace = "http://test.com.webService/", serviceName = "TestServiceService", portName = "TestServicePort", wsdlLocation = "WEB-INF/wsdl/TestServiceService.wsdl")
public class TestServiceDelegate {

	webService.com.test.TestService testService = new webService.com.test.TestService();

	public String test(String msg) {
		return testService.test(msg);
	}

}