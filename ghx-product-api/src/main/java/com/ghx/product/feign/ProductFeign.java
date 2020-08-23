package com.ghx.product.feign;

import com.ghx.common.response.Response;
import com.ghx.product.DTO.output.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ghx-product")
@RequestMapping("/product")
public interface ProductFeign {

    @GetMapping("/getById")
    Response<ProductDTO> getById(@RequestParam("id") Long id);


}
