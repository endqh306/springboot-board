package com.endqh.board.springboot.config.auth;

import com.endqh.board.springboot.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable()
                .and()
                .authorizeRequests()
                .antMatchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**", "/favicon.ico", "/profile").permitAll()
                .antMatchers("/notice").permitAll()
                .antMatchers("/posts/view/**").permitAll()
//                .antMatchers("/notice/view/**").hasAnyRole(Role.ADMIN.name(), Role.USER.name())
                .antMatchers("/notice/view/**").permitAll()
                .antMatchers("/notice/update/**").hasAnyRole(Role.ADMIN.name(), Role.USER.name())
                .antMatchers(HttpMethod.GET,"/api/v1/notice").permitAll()
                .antMatchers(HttpMethod.POST,"/api/v1/notice/**").hasRole(Role.ADMIN.name())
                .antMatchers(HttpMethod.PUT,"/api/v1/notice/**").hasRole(Role.ADMIN.name())
                .antMatchers(HttpMethod.DELETE,"/api/v1/notice/**").hasRole(Role.ADMIN.name())
                .antMatchers(HttpMethod.GET,"/api/v1/notice/**").hasAnyRole(Role.ADMIN.name(), Role.USER.name())
                .antMatchers("/api/v1/posts/**").hasAnyRole(Role.ADMIN.name(), Role.USER.name())
                .antMatchers(HttpMethod.GET,"/api/v1/log/**").permitAll()

                .anyRequest().authenticated()

                .and()
                .oauth2Login().loginPage("/login")

                .and()
                .logout().logoutSuccessUrl("/")

                .and()
                .oauth2Login().userInfoEndpoint().userService(customOAuth2UserService);
    }
}
