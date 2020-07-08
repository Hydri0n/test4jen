package xyz.hydrion.test4jen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hongsongxie
 * @date 2020/7/8
 */
@Controller
public class MyController {

    @ResponseBody
    @GetMapping("")
    public String index(){
        return "hello_world";
    }
}
