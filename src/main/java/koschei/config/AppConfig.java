package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public KoscheiTheDeathless getKoscheiTheDeathless () {
        return new KoscheiTheDeathless();
    }

    @Bean
    public Ocean1 getOcean() {
        return new Ocean1();
    }
    @Bean
    public Island2 getIsland() {
        return new Island2(getWood());
    }
    @Bean
    public Wood3 getWood() {
        return new Wood3(getRabbit());
    }
    @Bean
    public Rabbit4 getRabbit() {
        return new Rabbit4();
    }
    @Bean
    public Duck5 getDuck() {
        return new Duck5();
    }
    @Bean
    public Egg6 getEgg() {
        return new Egg6(getNeedle());
    }
    @Bean
    public Needle7 getNeedle() {
        return new Needle7();
    }
}
