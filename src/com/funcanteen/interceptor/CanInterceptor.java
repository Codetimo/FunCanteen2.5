package com.funcanteen.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CanInterceptor  implements HandlerInterceptor{

	//执行方法前
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
			//取页面路径名
			String requestURI = request.getRequestURI();
			if(!requestURI.contains("login")){
				String username = (String) request.getSession().getAttribute("USER_SESSION1");
				if(null == username){
					response.sendRedirect(request.getContextPath() + "/login.action");
					return false;
				}
			}
			return true;
		}
	//页面渲染后
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
	}

	//执行方法后
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

}
