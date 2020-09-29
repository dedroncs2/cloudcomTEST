package controllers;

import models.table;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.TableServices;


import java.util.Map;

@Controller
public class GreetingController {


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String,Object> model) {
        model.put("name",name);

        return "greeting";
    }
    @GetMapping()
    public String main(Map<String,Object> model){
        TableServices tableService = new TableServices();
        Iterable<table> users = tableService.findAllActive();
        model.put("users",users);
        //for(table t: users)
        //   if(t.getSubtype()!="send"){
        //        users.r
        //        model.put("users",t);
        //    }

        return "main";

    }


}
