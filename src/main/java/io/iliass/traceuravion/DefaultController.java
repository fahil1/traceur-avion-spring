package io.iliass.traceuravion;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController implements ErrorController {

    @RequestMapping("/error")
    public String index() {
        return "index.html";
    }

    @Override
    public String getErrorPath() {
        return "index.html";
    }
}
