package com.moustercorp.poc.poccatalogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moustercorp.poc.poccatalogos.entities.MateriaEntity;

/**
 * @author jbatis
 */
public interface MateriaRepository extends JpaRepository<MateriaEntity, Long> {
    
}
