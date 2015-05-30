package controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class DimaController {
    
    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String showCreateUser(Model model) {  
        model.addAttribute("helloMessage", "Connect to Spring");
        return "index";
    }
}