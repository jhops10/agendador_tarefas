package com.jhops10.agendadortarefas.business.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jhops10.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasDTO {

    private String id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dataEvento;

    private String emailUsuario;
    private LocalDate dataAlteracao;
    private StatusNotificacaoEnum statusNotificacaoEnum;
}
