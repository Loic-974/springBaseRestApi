package com.expert.baseRestApi.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


import com.expert.baseRestApi.utils.JwtRequestFilter;

@Configuration
public class GlobalConfiguration {

	
	@Autowired
    private JwtRequestFilter jwtRequestFilter;

	/*@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
	  throws Exception {
	    auth.jdbcAuthentication()
	      .dataSource(dataSource)
	      .withDefaultSchema()
	      .withUser(User.withUsername("user") 
	        .password(passwordEncoder().encode("pass"))
	        .roles("USER"));
	}*/
	
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/").permitAll()
				.anyRequest().authenticated()
			);
			
			//.csrf().disable()
			//.httpBasic(withDefaults());
			http.addFilterAfter(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}

	/*@Bean
	public UserDetailsService userDetailsService(DataSource dataSource) {
		UserDetails user =
			 User.withUsername("nom")
				.username("user")
				.password("password")
				.roles("USER")
				.build();

		return new InMemoryUserDetailsManager(user);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}*/
}
