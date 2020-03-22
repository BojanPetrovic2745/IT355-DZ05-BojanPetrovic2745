package met.local.config;

import met.local.domain.KlasaConverter;
import met.local.service.AutomobilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("met.local")
public class WebConfiguration implements WebMvcConfigurer {

    @Autowired
    private AutomobilService automobilService;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new KlasaConverter(automobilService));
    }

}
