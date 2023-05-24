package ouss.apiOuss.Models.CandidatoData;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import ouss.apiOuss.Models.CandidatoModel;

public abstract class CandidatoManyToOne {

    @ManyToOne
    @JoinColumn(name="CandidatoModel")
    private CandidatoModel candidato;
}
