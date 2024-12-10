package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "clube")
public class Clube {

    @Id
    @Column(name = "id_clube")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome_clube")
    private String nome_clube;

    @Column(name = "data_fundacao")
    private String data_fundacao;

    @OneToMany(targetEntity = Atleta.class , mappedBy = "clube",
               cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Atleta> atletas;



}
