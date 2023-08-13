package com.moustercorp.poc.poccatalogos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author jbatis
 */
@Entity
@Data
public class MateriaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreMateria;
    private String claveMateria;
}
