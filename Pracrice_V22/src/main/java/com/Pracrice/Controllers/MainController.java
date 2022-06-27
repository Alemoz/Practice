package com.Pracrice.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @PostMapping("/")
    protected void doPost (){

    }

   // @Autowired
   // private StoreInfoRepository storeInfoRepository;

    
}
