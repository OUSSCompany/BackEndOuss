package ouss.apiOuss.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.sql.Blob;
import java.time.LocalDate;

@Entity
@Table(name="candidato")
public class CandidatoModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="nome_candidato", length=50, nullable=false, unique=false)
    private String name;

    private List<occupationArea> listAreas;

    private LocalDate dataNascimento;

    private List<AcademicEducation> listFormacao;

    private List<experience> listExperience;

    private List<senioridade> listSenioridade;

    private String NumberWhatsApp;

    private List<idiomas> listIdiomas;

    private List<SoftSkills> listSoftSkills;

    private List<HardSkills> listHardSkills;

    private String description;

    private Blob curriculum;

    private String Linkedin;

    private List<OthersLinks> listLinks;

    private Double maxWage;

    private Double minAge;





}
