package ouss.apiOuss.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="candidato")
public class CandidatoModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="nome_candidato", length=50, nullable=false, unique=false)
    private String name;



}
