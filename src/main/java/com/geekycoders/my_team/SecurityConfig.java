package com.geekycoders.my_team;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http
        .csrf().disable()
        .authorizeRequests()
        
          .antMatchers(HttpMethod.POST, "/api/**").authenticated()
          .antMatchers(HttpMethod.PUT, "/api/**").authenticated()
          .antMatchers(HttpMethod.DELETE, "/api/**").authenticated()
          .antMatchers(HttpMethod.GET, "/api/**").authenticated()
          .antMatchers(HttpMethod.GET, "/**").permitAll() 
          .anyRequest().permitAll()
          .and()
        .httpBasic().and()
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
  }