package ouss.apiOuss.Models.CandidatoData;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Experience extends CandidatoManyToOne{

    @Column(name="primeiraArea", length=50, nullable=false, unique=false)
    private String area1;

    @Column(name="segundaArea", length=50, nullable=false, unique=false)
    private String area2;

    @Column(name="terceiraArea", length=50, nullable=false, unique=false)
    private String area3;

    @Column(name="quartaArea", length=50, nullable=false, unique=false)
    private String area4;
}
