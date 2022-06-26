package com.nttdata.proyectoJavaMicroservicios.model.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor

@Document(collection = "clients")
public class Client {

    @Id
    private Long id;
    private Long idcustomerType;
    private String names;
    private String surnames;
    private String dni;
    private String phone;
    private String email;

}
