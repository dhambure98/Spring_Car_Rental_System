package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {

}
