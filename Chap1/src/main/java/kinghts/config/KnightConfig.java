package main.java.kinghts.config;

import main.java.kinghts.BraveKinghts;
import main.java.kinghts.Knight;
import main.java.kinghts.Quest;
import main.java.kinghts.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKinghts(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
