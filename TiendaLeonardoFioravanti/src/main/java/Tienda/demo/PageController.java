package Tienda.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/paracaidismo")
    public String paracaidismo() {
        return "paracaidismo";
    }

    @GetMapping("/escalada")
    public String escalada() {
        return "escalada";
    }

    @GetMapping("/surf")
    public String surf() {
        return "surf";
    }

    @GetMapping("/snowboarding")
    public String snowboarding() {
        return "snowboarding";
    }

    @GetMapping("/buceo")
    public String buceo() {
        return "buceo";
    }

    @GetMapping("/parkour")
    public String parkour() {
        return "parkour";
    }

    @GetMapping("/rafting")
    public String rafting() {
        return "rafting";
    }

    @GetMapping("/kitesurf")
    public String kitesurf() {
        return "kitesurf";
    }
}