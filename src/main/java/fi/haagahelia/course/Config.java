package fi.haagahelia.course;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DataConfig.class)
@ComponentScan("fi.haagahelia.course")
public class Config {
	
}
