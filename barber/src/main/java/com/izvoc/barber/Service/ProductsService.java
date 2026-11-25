package com.izvoc.barber.Service;

import com.izvoc.barber.DTO.ProductsDTO;
import com.izvoc.barber.Entities.Products;
import com.izvoc.barber.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository PRepository;





    public ProductsDTO insertProducts(ProductsDTO PDTO){

        Products products = new Products();

        products.setName(PDTO.getName());
        products.setPrice(PDTO.getPrice());
        PRepository.save(products);

        return new ProductsDTO (products.getName(),products.getId(),  products.getPrice());


    }


    public List<ProductsDTO> getAll(){
       List<Products> products = PRepository.findAll();
         List  <ProductsDTO>  productsDTO =  new ArrayList<>();

        for (Products product : products){

            ProductsDTO dto = new ProductsDTO
                    (
                            product.getName(),
                    product.getId(),
                    product.getPrice()



            ); productsDTO.add(dto);

        }
        return productsDTO;

    }

    public ProductsDTO getId(Long id){
        Products products = PRepository.findById(id).orElseThrow(()->
                new RuntimeException("Produto Nao encontrado ou" +
                "não existente"));



            ProductsDTO dto = new ProductsDTO(

                    products.getName(),
                    products.getId(),
                    products.getPrice()


                    ); return dto;

    }


    public ProductsDTO putProduct(Long id,ProductsDTO prodDTO){

        Products products= PRepository.findById(id).orElseThrow(()->new RuntimeException("Produto nao" +
                " existente"));
        products.setName(prodDTO.getName());
        products.setPrice(prodDTO.getPrice());

        PRepository.save(products);
        return new ProductsDTO(products.getName(),products.getId(),products.getPrice());


    }


    public ProductsDTO deleteProduct(Long id){

        Products products= PRepository.findById(id).
                orElseThrow(()->new RuntimeException("Produto  ja nao" +
                " existente"));

        ProductsDTO pdto = new ProductsDTO(

                products.getName(),
                products.getId(),
                products.getPrice()



        );
        PRepository.delete(products);

        return pdto;
    }



}
