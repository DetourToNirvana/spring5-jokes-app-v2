package sid.sf.spring5jokesappv2.JokesController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sid.sf.spring5jokesappv2.service.JokesService;

@Controller
public class JokesController {
    JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());

        return "index.html";
    }
}
