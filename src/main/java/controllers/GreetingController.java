package controllers;

import models.table;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.TableServices;


import java.util.ArrayList;
import java.util.List;
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


        return "main";
    }

    @GetMapping("/UsedForms")
    public String UsedForms(Map<String,Object> model){
        TableServices tableService = new TableServices();
        Iterable<table> usedforms = tableService.findUsedFroms();
        model.put("UsedForms",usedforms);
        return "UsedForms";
    }

    @GetMapping("/top5")
    public String top5(Map<String,Object> model){
        TableServices tableService = new TableServices();
        List<Object[]> top = tableService.findForms();
        System.out.println(top.get(0)[0].toString()+" "+top.get(0)[1].toString());
        List<String> top5 = new ArrayList<>();
        for(Object[] obj:top)
        {
            top5.add("форма:"+obj[0].toString()+"; колличество использований: "+obj[1].toString());
        }


        model.put("top5",top5);


        return "top5";
    }


}
