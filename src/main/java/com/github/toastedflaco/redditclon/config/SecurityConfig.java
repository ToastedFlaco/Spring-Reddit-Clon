package com.github.toastedflaco.redditclon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*Let’s understand what did we configure in the above class:

@EnableWebSecurity
This is the main annotation which enables the Web Security module in our Project.
WebSecurityConfigurerAdapter
This is the base class for our SecurityConfig class, it provides us the default security configurations, which we can override in our SecurityConfig and customize them.
Configurations
Next, we have the configure method which we have overridden from the base class which takes HttpSecurity as an argument.
Here, we are configuring Spring to allow all the requests which match the endpoint “/api/auth/**” , as these endpoints are used for authentication and registration we don’t expect the user to be authenticated at that point of time.
PasswordEncoder
Now before storing the user in the database, we ideally want to encode the passwords. One of the best hashing algorithms for passwords is the Bcrypt Algorithm. We are using the BCryptPasswordEncoder class provided by Spring Security.*/

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true,
        jsr250Enabled = true
)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/auth/**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
