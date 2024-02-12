package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Adiciona getters/setters automaticamente utilizando Lombok
@AllArgsConstructor // Cria um construtor com todos os atributos
@NoArgsConstructor // Cria um construtor vazio

//Classe de relacionamentos
public class AnswersCertificationsEntity {

    private UUID id;
    private UUID certificationID;
    private UUID studentID;
    private UUID questionID;
    private UUID answerID;
    private boolean isCorrect;

}
