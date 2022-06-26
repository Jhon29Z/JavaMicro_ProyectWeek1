package com.nttdata.proyectoJavaMicroservicios.model.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor

@Document(collection = "accounts")
public class Account {

    @Id
    private Long id;
    private Long idClient;
    private Long idProduct;
    private Long idAccountHolder;
    private Long idAuthorizedSigners;
    private Double amount;
    private Long idCoinType;
}
