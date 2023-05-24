package ouss.apiOuss.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import ouss.apiOuss.Models.CandidatoData.*;

import java.sql.Blob;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="CandidatoModel")
public class CandidatoModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    @Column(name="nome_candidato", length=50, nullable=false, unique=false)
    private String name;


    @Column(name="AreaOcupacoes", length=50, nullable=false, unique=false)
    @OneToMany(mappedBy = "CandidatoModel")
    private List<occupationArea> listAreas;


    @Column(name="dataNascimento", length=50, nullable=false, unique=false)
    private LocalDate dataNascimento;


    @Column(name="AcademicEducation",  nullable=false, unique=false)
    private List<AcademicEducation> listFormacao;


    @Column(name="Experience",  nullable=false, unique=false)
    private List<Experience> listExperience;


    @Column(name="senioridade",  nullable=false, unique=false)
    private List<Senioridade> listSenioridade;


    @Column(name="NumberWhatsApp", length=50, nullable=false, unique=false)
    private String NumberWhatsApp;


    @Column(name="idiomas",  nullable=false, unique=false)
    private List<Idiomas> listIdiomas;


    @Column(name="SoftSkills",  nullable=false, unique=false)
    private List<SoftSkills> listSoftSkills;


    @Column(name="HardSkills",  nullable=false, unique=false)
    private List<HardSkills> listHardSkills;


    @Column(name="description", length=50, nullable=false, unique=false)
    private String description;


    @Column(name="curriculum", length=50, nullable=false, unique=false)
    private Blob curriculum;


    @Column(name="LinkedinLink", length=50, nullable=false, unique=false)
    private String Linkedin;


    @Column(name="Links", length=50, nullable=false, unique=false)
    private List<OthersLinks> listLinks;


    @Column(name="maxWage", length=50, nullable=true, unique=false)
    private Double maxWage;


    @Column(name="minAge", length=50, nullable=true, unique=false)
    private Double minAge;


    @Column(name="Score", length=50, nullable=true, unique=false)
    private Double Score;









}
