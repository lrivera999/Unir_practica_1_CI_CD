package com.loteria.repository;

import org.springframework.data.repository.CrudRepository;
import com.loteria.models.usuariosModel;

public interface usuariosRepository extends CrudRepository<usuariosModel, Long> {

}
