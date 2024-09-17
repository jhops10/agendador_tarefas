package com.jhops10.agendadortarefas.business;

import com.jhops10.agendadortarefas.business.dto.TarefasDTO;
import com.jhops10.agendadortarefas.business.mapper.TarefasConverter;
import com.jhops10.agendadortarefas.infrastructure.entity.TarefasEntity;
import com.jhops10.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import com.jhops10.agendadortarefas.infrastructure.repository.TarefasRepository;
import com.jhops10.agendadortarefas.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO tarefasDTO) {
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        tarefasDTO.setDataCriacao(LocalDateTime.now());
        tarefasDTO.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        tarefasDTO.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefaEntity(tarefasDTO);

        return tarefaConverter.paraTarefaDTO(tarefasRepository.save(entity));
    }




}
