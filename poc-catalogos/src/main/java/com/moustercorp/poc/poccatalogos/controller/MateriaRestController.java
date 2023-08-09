package com.moustercorp.poc.poccatalogos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.moustercorp.poc.poccatalogos.entities.MateriaEntity;
import com.moustercorp.poc.poccatalogos.repository.MateriaRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/materia")
public class MateriaRestController {

    @Autowired
    private MateriaRepository materiaRepository;

    @GetMapping(value = "/findAll")
    public List<MateriaEntity> findAll() {
        return this.materiaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MateriaEntity> getMethodName(@RequestParam Long id) {
        Optional<MateriaEntity> result = this.materiaRepository.findById(id);
        return result.map(materia -> 
            new ResponseEntity<>(materia, HttpStatus.OK)).orElseThrow(() -> 
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Materia no encontrada en base al ID."));
    }
    
    @PostMapping(value = "/save")
    public ResponseEntity<MateriaEntity> postMethodName(@RequestBody MateriaEntity entity) {
        return ResponseEntity.ok(this.materiaRepository.save(entity));
    }

}
