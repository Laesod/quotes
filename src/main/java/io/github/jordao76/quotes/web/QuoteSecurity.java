package io.github.jordao76.quotes.web;

import static org.springframework.http.HttpMethod.*;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;

@Configuration
@EnableWebSecurity
public class QuoteSecurity extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      .csrf().disable()
      .headers().frameOptions().disable()
      .and().httpBasic()
      .and().authorizeRequests()
        .antMatchers(GET, "/quotes/**").permitAll()
        .antMatchers(DELETE, "/quotes/**").hasRole("MAINTAINER")
        .antMatchers(POST, "/quotes").hasRole("MAINTAINER")
        .antMatchers("/manage/**", "/h2-console/**").hasRole("ADMIN")
        .antMatchers("/**").permitAll();
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth
      .inMemoryAuthentication()
      .withUser("admin")
      .password("password")
      .roles("MAINTAINER", "ADMIN");
  }

}
