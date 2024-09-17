package com.jhops10.agendadortarefas.business.mapper;

import com.jhops10.agendadortarefas.business.dto.TarefasDTO;
import com.jhops10.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {


    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataEvento", target = "dataEvento")
    @Mapping(source = "dataCriacao", target = "dataCriacao")
    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

    List<TarefasEntity> paraListaTarefasEntity (List<TarefasDTO> tarefasDTO);
    List<TarefasDTO> paraListaTarefasDTO (List<TarefasEntity> tarefasEntity);
}
