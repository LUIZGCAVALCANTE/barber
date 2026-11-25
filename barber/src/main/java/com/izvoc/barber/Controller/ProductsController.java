package com.izvoc.barber.Controller;


import com.izvoc.barber.DTO.ProductsDTO;
import com.izvoc.barber.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    ProductsService Pservice;


    @PostMapping("/new")
    public ProductsDTO insertProducts(@RequestBody ProductsDTO PDTO){

        return Pservice.insertProducts(PDTO);

    }
    @GetMapping("/getallp")
    public List<ProductsDTO> getAll(){

        return Pservice.getAll();
    }

    @GetMapping("/getidp/{id}")
    public ProductsDTO getId(@PathVariable Long id){
        return Pservice.getId(id);

    }

    @DeleteMapping("/dell/{id}")
    public ProductsDTO deleteProduct(@PathVariable Long id){

        return Pservice.deleteProduct(id);

    }

        @PutMapping("/att/{id}")
    public ProductsDTO putProduct(@RequestBody ProductsDTO prodDTO, @PathVariable Long id ){
        return Pservice.putProduct( id, prodDTO);

    }
}
