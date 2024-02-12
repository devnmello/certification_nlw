package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Adiciona getters/setters automaticamente utilizando Lombok
@AllArgsConstructor // Cria um construtor com todos os atributos
@NoArgsConstructor // Cria um construtor vazio

public class CertificationStudentEntity {

    private UUID id;
    private UUID studentID;
    private String technology;
    private int grade;
    List<AnswersCertificationsEntity> answersCertificationsEntities;

}
