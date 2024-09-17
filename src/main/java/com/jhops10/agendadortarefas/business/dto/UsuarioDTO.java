package com.jhops10.agendadortarefas.business.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    private String nome;
    private String email;
    private String senha;
}
