package com.izvoc.barber.Controller;

import com.izvoc.barber.DTO.ClientsDTO;
import com.izvoc.barber.Entities.Clients;
import com.izvoc.barber.Service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barber")
public class ClientsController {

    @Autowired
    private ClientsService ClientsService;

    @PostMapping("/newclients")
    public ClientsDTO InsertClient(@RequestBody ClientsDTO clientsDTO){


        return ClientsService.InsertClient(clientsDTO);

    }

    @GetMapping("/getallclients")
    public List <ClientsDTO> getAll(){

        return ClientsService.getAll();

    }

    @GetMapping("/clients/{id}")
    public ClientsDTO getId(@PathVariable Long id){


        return ClientsService.getId(id);
    }

    @PutMapping("update/{id}")
    public ClientsDTO ClientUpdate(  @RequestBody ClientsDTO clientsDTO, @PathVariable Long id){

        return ClientsService.ClientUpdate(clientsDTO, id);
    }

    @DeleteMapping("/dell/{id}")

    public ClientsDTO deleteUserId(@PathVariable Long id){
        return ClientsService.deleteUserId(id);
    }

}
