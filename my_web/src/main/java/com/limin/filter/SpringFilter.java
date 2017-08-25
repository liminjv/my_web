package com.limin.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 * 在preHandle中，可以进行编码、安全控制等处理； 
 * 在postHandle中，有机会修改ModelAndView； 
 * 在afterCompletion中，可以根据ex是否为null判断是否发生了异常，进行日志记录。
 * @author 李 民
 * @date 2017年4月12日 下午4:55:40
 */
public class SpringFilter extends HandlerInterceptorAdapter{

	private final Logger logger = LoggerFactory.getLogger(SpringFilter.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		logger.info("当前位置："+Thread.currentThread().getStackTrace()[1].getMethodName());
		return super.preHandle(request, response, handler);
	}
	
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("当前位置："+Thread.currentThread().getStackTrace()[1].getMethodName());
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("当前位置："+Thread.currentThread().getStackTrace()[1].getMethodName());
		super.afterCompletion(request, response, handler, ex);
	}
}
