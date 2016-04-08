package th.co.dtac.mobile.rtr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import th.co.dtac.mobile.rtr.web.filter.MDCFilter;

import javax.servlet.Filter;

/**
 * Created by amanurat on 4/6/2016 AD.
 */
@Configuration
public class FilterConfig {

    @Bean
    public Filter MDCFilter() {
        return new MDCFilter();
    }
}
