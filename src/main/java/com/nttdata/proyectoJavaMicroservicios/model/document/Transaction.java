package com.nttdata.proyectoJavaMicroservicios.model.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor

@Document(collection = "transactions")
public class Transaction {

    @Id
    private Long id;
    private Long idTransactionType;
    private Long idAccount;
    private Double transactionAmount;
}
