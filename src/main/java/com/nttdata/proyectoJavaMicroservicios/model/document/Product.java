package com.nttdata.proyectoJavaMicroservicios.model.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor

@Document(collection = "products")
public class Product {

    @Id
    private Long id;
    private Long idproductType;
    private String description;


}
