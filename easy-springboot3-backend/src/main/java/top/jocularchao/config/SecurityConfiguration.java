package top.jocularchao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/9 22:37
 * @Description
 */
@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(conf -> conf
                        .requestMatchers("api/auth/**").permitAll()
                        .anyRequest().authenticated()
                )
                .build();
    }
}
