package ouss.apiOuss.Models.CandidatoData;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import ouss.apiOuss.Models.CandidatoModel;

@Entity
public class occupationArea extends CandidatoManyToOne {


    @Column(name="primeiraArea", length=50, nullable=false, unique=false)
    private String area1;

    @Column(name="segundaArea", length=50, nullable=false, unique=false)
    private String area2;

    @Column(name="terceiraArea", length=50, nullable=false, unique=false)
    private String area3;

}
