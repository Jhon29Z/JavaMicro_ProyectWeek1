package com.nttdata.proyectoJavaMicroservicios.model.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor

@Document(collection = "customerTypes")
public class CustomerType {

    @Id
    private Long id;
    private String description;
}
