package com.crud.portiolio;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class AtletaController {

    AtletaRepository atletaRepository;
    @GetMapping("/atleta")
    public List<Atleta> getAllAtletas(){
        return atletaRepository.findAll();
    }

    @GetMapping("/atleta/{id}")
    public Atleta getAtletabyId(@PathVariable Long id){
        return atletaRepository.findById(id).get();
    }

    @PostMapping("/atleta")
    public Atleta save(@RequestBody Atleta atleta){    //ERRO AQUI
        return atletaRepository.save(atleta);
    }

    @DeleteMapping("/atleta/{id}")
    public void deleteAtleta(@PathVariable Long id){
        atletaRepository.deleteById(id);
    }

}
