package com.ghx.user.controller;

import com.ghx.common.response.Response;
import com.ghx.product.DTO.output.ProductDTO;
import com.ghx.product.feign.ProductFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private ProductFeign productFeign;

    /**
     * 测试feign
     *
     * @param id
     * @return
     */
    @GetMapping("/user/getProduct")
    public Response<ProductDTO> getProduct(Long id) {
        Response<ProductDTO> response = productFeign.getById(id);
        return response;

    }
}
