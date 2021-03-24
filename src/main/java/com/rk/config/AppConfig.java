package com.rk.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.rk")
@PropertySource("classpath:dbinfo.properties")
@EnableTransactionManagement
@EnableWebMvc
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean
	public DataSource ds() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("mysqldriver"));
		ds.setUrl(env.getProperty("mysqlurl"));
		ds.setUsername(env.getProperty("mysqluser"));
		ds.setPassword(env.getProperty("mysqlpwd"));
		return ds;
	}

	@Bean
	public Properties prop() {
		Properties p = new Properties();
		p.put("hibernate.dialect", env.getProperty("hb_dialect"));
		p.put("hibernate.show_sql", env.getProperty("hb_showsql"));
		p.put("hibernate.format_sql", env.getProperty("hb_format"));
		p.put("hibernate.hbm2ddl.auto", env.getProperty("hb_hbmddl"));
		return p;
	}

	@Bean
	public LocalSessionFactoryBean lsb() {
		LocalSessionFactoryBean s = new LocalSessionFactoryBean();
		s.setDataSource(ds());
		s.setHibernateProperties(prop());
		s.setPackagesToScan("com.rk");
		return s;
	}

	@Bean
	public HibernateTemplate ht() {
		return new HibernateTemplate(lsb().getObject());
	}

	@Bean
	public HibernateTransactionManager htm() {
		HibernateTransactionManager h = new HibernateTransactionManager();
		h.setSessionFactory(lsb().getObject());
		return h;
	}

	@Bean
	public InternalResourceViewResolver iv() {
		InternalResourceViewResolver i = new InternalResourceViewResolver();
		i.setPrefix(env.getProperty("mvc_prefix"));
		i.setSuffix(env.getProperty("mvc_suffix"));
		return i;
	}

}
