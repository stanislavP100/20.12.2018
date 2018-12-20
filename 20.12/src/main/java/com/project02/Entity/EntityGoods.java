package com.project02.Entity;

import javax.persistence.*;

@Entity
@Table(name="table_goods", catalog ="db21" )
public class EntityGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="goods_id")
    private Long id;

    @Column(name="goods_name")
    private String name;

    public EntityGoods(){}

   public EntityGoods(String name)
    {
        this.name=name;
    }


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



   /* @GetMapping("/pg")
    public String getPage(Map<String, Object> model)
    {
        // Collection<EntityGoods> goodslist = repositoryGoods.findAll();
        //  model.put("goodslist", goodslist);
        model.put("goodslist",repositoryGoods.findAll());
        return "page";
    }
*/