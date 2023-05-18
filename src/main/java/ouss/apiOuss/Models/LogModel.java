package ouss.apiOuss.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import ouss.apiOuss.Enums.HttpMethod;
import ouss.apiOuss.Repository.LogRepository;

@Entity
public class LogModel {




    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="description", length=50, nullable=false, unique=false)
    private String description;

    @Column(name="httpMethod" , nullable=false, unique=false)
    private HttpMethod method;
}
