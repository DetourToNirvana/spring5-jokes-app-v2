package sid.sf.spring5jokesappv2.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    ChuckNorrisQuotes getChuckNorrisQuotesBean() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

        return chuckNorrisQuotes;
    }
}
