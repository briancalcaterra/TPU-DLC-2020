/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.commons;

import commons.exceptions.TechnicalException;
import java.util.List;

/**
 * Interfaz que define los métodos mínimos a ser implementados por un dao para una entidad mapeada a la base de datos
 *  
 * @author Felipe
 *
 * @param <E> Entidad para la cual se implementa el presente dao
 * @param <K> Clave de la entidad representada por el dao
 */
public interface Dao<E extends DalEntity, K>
{
    void update(E pData);

    void delete(K pKey);
    
    E create(E pData);

    E retrieve(K pKey);

    List<E> findAll();

}

