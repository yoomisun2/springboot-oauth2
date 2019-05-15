package sample.oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http
        	.antMatcher("/**")
        	.authorizeRequests().antMatchers("/login**","/callback/", "/webjars/**", "/error**", "/favicon.ico").permitAll()
        	.anyRequest().authenticated()
        	.and()
        	.oauth2Login()
        	.and()
        	.oauth2Client();
	}
}