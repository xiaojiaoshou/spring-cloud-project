package com.ghx.product.controller;

import com.ghx.common.response.Response;
import com.ghx.product.DTO.output.ProductDTO;
import com.ghx.product.feign.ProductFeign;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductFeign {

    @Override
    public Response<ProductDTO> getById(Long id) {
        System.out.println("入参=" + id);
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(1L).setName("牛仔裤").setPrice(200);
        Response<ProductDTO> response = Response.data(productDTO);
        return response;


    }
}
