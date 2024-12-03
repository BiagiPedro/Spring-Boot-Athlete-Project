package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "atleta")
public class Atleta {

    @Id
    @Column(name = "id_atleta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tx_nome")
    private String nome;

    @Column(name = "int_idade")
    private int idade;

    @Column(name = "tx_posico")
    private String posicao;

}
