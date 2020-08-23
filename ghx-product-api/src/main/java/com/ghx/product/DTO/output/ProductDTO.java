package com.ghx.product.DTO.output;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Accessors(chain = true)
@Data
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = -6986089718039900744L;

    private Long id;

    private String name;

    private Integer price;


}
