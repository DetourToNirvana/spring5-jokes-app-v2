package sid.sf.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JokesServiceImpl.class);

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke() {
        String joke = chuckNorrisQuotes.getRandomQuote();
        LOGGER.info("Got joke: \"{}\"", joke);
        return joke;
    }
}
