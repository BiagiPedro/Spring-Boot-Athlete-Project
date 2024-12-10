package controllers;

import lombok.AllArgsConstructor;
import models.Clube;
import org.springframework.web.bind.annotation.*;
import repositories.ClubeRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClubeController {

    ClubeRepository clubeRepository;

    @GetMapping("/clube")
    public List<Clube> getAllClubes(){
        return clubeRepository.findAll();
    }

    @GetMapping("/clube/{id}")
    public Clube getClubeById(@PathVariable Long id){
        return clubeRepository.findById(id).get();
    }


    @PostMapping("/clube")
    public Clube save(@RequestBody Clube clube){
        return clubeRepository.save(clube);
    }

    @DeleteMapping("/clube/{id}")
    public void deleteClubeByid(@PathVariable Long id){

        System.out.println(clubeRepository.getById(id));
        clubeRepository.deleteById(id);
    }
}
