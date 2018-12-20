package com.project02.Controller;

import com.project02.Entity.EntityGoods;
import com.project02.Repository.RepositoryGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ControllerGoods {

    @Autowired
private RepositoryGoods repositoryGoods;

    @GetMapping("/pg")
    public String getPage(Map<String,Object> model)
    {
        model.put("goodslist",repositoryGoods.findAll());
        return "page";
    }

    @PostMapping("/pg")
    public String postPage(@RequestParam String name, Map<String,Object> model)
    {
        EntityGoods goods=new EntityGoods();
        goods.setName(name);
       // repositoryGoods.save(goods);
        repositoryGoods.deleteAll();
        model.put("goodslist",repositoryGoods.findAll());

        return "page";
    }

}
