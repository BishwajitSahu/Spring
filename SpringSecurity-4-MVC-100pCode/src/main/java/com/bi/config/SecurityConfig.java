package com.bi.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	DataSource ds;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(ds)
			.usersByUsernameQuery("select uname,pwd,status from users where uname=?")
			.authoritiesByUsernameQuery("select uname,role from users_role where uname=?");
	}
	 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/home.htm").access("permitAll")
			.antMatchers("/getBal.htm").access("hasAnyRole('ROLE_CUSTOMER', 'ROLE_MANAGER')")
			.antMatchers("/login.htm").access("permitAll")
			.antMatchers("/logout").access("permitAll")
			.antMatchers("/login").access("permitAll")
			.and()
				.formLogin().loginPage("/login.htm").loginProcessingUrl("/login")
				.usernameParameter("uname").passwordParameter("pwd").failureUrl("/access_denie.htm")
			.and()
				.logout().logoutUrl("/logout").logoutSuccessUrl("/home.htm")
			.and()
				.exceptionHandling().accessDeniedPage("/access_denied.jsp")
			.and()
				.sessionManagement().maximumSessions(2).expiredUrl("/home.htm");
			
	}
}
