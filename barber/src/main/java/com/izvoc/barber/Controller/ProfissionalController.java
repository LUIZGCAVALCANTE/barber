package com.izvoc.barber.Controller;

import com.izvoc.barber.DTO.ProfissionalDTO;
import com.izvoc.barber.Service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissional")
public class ProfissionalController {

    @Autowired
    ProfissionalService ProService;



    @PostMapping("/new")
    public ProfissionalDTO newInsert(@RequestBody ProfissionalDTO profissaDTO){

        return ProService.newInsert(profissaDTO);

    }


    @GetMapping("/getall")
    public List <ProfissionalDTO> getAll(){


        return ProService.getAll();
    }

}
