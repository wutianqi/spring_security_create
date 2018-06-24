package com.wuqi.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * 替代web.xml的配置
 * @author wuqi
 * @date 2018/06/13
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {MyWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		//将DispatcherServlet映射到 /
		return new String[] {"/"};
	}

}
