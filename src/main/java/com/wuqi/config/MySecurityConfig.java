package com.wuqi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/**
 * spring security配置类
 * @author wuqi
 * @date 2018/06/13
 */
@EnableWebSecurity
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configUser(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
				//创建用户名为user，密码为password的用户
				.withUser("user").password("password").roles("USER");
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//        .authorizeRequests() //注册FilterSecurityInterceptor
//             .antMatchers("/index.html").permitAll()//访问index.html不要权限验证
//             .anyRequest().authenticated()//其他所有路径都需要权限校验
//        .and()
//             .csrf().disable()//默认开启，可以显示关闭
//        .formLogin()  //内部注册 UsernamePasswordAuthenticationFilter
//            .loginPage("/login.html") //表单登录页面地址
//            .loginProcessingUrl("/login")//form表单POST请求url提交地址，默认为/login
//            .passwordParameter("password")//form表单用户名参数名
//            .usernameParameter("username") //form表单密码参数名
//            .successForwardUrl("/success.html")  //登录成功跳转地址
//            .failureForwardUrl("/error.html") //登录失败跳转地址
//            //.defaultSuccessUrl()//如果用户没有访问受保护的页面，默认跳转到页面
//            //.failureUrl()
//            //.failureHandler(AuthenticationFailureHandler)
//            //.successHandler(AuthenticationSuccessHandler)
//            //.failureUrl("/login?error")
//            .permitAll();//允许所有用户都有权限访问loginPage，loginProcessingUrl，failureForwardUrl
//	}
	
}
