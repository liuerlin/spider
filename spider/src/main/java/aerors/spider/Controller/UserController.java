package aerors.spider.Controller;

import aerors.spider.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

/*    @RequestMapping(value = "/validate",method = {RequestMethod.POST})
    public ModelAndView validate(@RequestParam(value="name") String name,
                                 @RequestParam(value="password") String password, HttpSession session){
        if(name.equals("eddie") && password.equals("123456")){
            User usr = new User(name,password);
            session.setAttribute("user",usr);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("forward:/satellite/searchAll");
            return mv;
        }else{
            ModelAndView mv = new ModelAndView("login");
            return mv;
        }
    }*/

    @RequestMapping(value = "/validate",method = {RequestMethod.POST})
    public ModelAndView validate(@RequestParam(value="name") String name,
                                 @RequestParam(value="password") String password,
                                 HttpSession session) {
        if(name.equals("eddie") && password.equals("123456")){
            System.out.println("登录成功!");
            User usr = new User(name,password,32);
            session.setAttribute("user",usr);
            return new ModelAndView("forward:/satellite/searchAll");//采用ModelAndView重定向;
        }else{
            return new ModelAndView("forward:/user/login");
        }
    }

    @RequestMapping(value = "/loginOut",method = {RequestMethod.POST,RequestMethod.GET})
    public String loginOut(HttpSession session){
        session.setAttribute("user",null);
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session){
       if(session.getAttribute("user") != null){
           return "greet";
       }else{
           return "login";
       }
    }
    @RequestMapping("/greet")
    public String greet(){
        return "greet";
    }
}
