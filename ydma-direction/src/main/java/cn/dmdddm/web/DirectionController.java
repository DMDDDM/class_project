package cn.dmdddm.web;

import cn.dmdddm.entity.YdmaResult;
import cn.dmdddm.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectionController {
    @Autowired
    DirectionService directionService;

    @GetMapping("/direction")
    public YdmaResult direction(){

        return directionService.findAll();
    }

}
