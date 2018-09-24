package com.bi.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
@ComponentScan(basePackages="com.bi.dao")
public class PersistenceConfig {
	@Bean(name="ds")
	public DataSource createDataSource() {
		JndiDataSourceLookup jdsl=null;
		DataSource ds=null;
		jdsl=new JndiDataSourceLookup();
		ds= jdsl.getDataSource("java:/comp/env/DsJndi");
		return ds;
	}
	
	@Bean(name="jt")
	public JdbcTemplate createJdbcTemplate() {
		return new JdbcTemplate(createDataSource());
	}
}
