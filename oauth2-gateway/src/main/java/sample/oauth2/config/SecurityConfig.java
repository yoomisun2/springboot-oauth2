package sample.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SecurityConfig {
	
	@Bean
	SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
        http
        	.authorizeExchange().pathMatchers("/login**","/callback/", "/webjars/**", "/error**", "/favicon.ico").permitAll()
        	.anyExchange().authenticated()
        	.and()
        	.oauth2Login()
        	.and()
        	.oauth2Client();
        return http.build();
	}
}
