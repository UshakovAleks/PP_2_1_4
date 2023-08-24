package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public Wood3 wood(Rabbit4 rabbit) {
        return new Wood3(rabbit);
    }
    @Bean
    public Rabbit4 rabbit(Duck5 duck) {
        return new Rabbit4(duck);
    }
    @Bean
    public Duck5 duck5(Egg6 egg6) {
        return new Duck5(egg6);
    }
    @Bean
    public Egg6 egg(Needle7 needle7) {
        return new Egg6(needle7);
    }
    @Bean
    public Needle7 needle(Deth8 deth8) {
        return new Needle7(deth8);
    }
    @Bean
    public Deth8 deth(){
        return new Deth8();
    }
}
