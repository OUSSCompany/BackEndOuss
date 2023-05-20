package ouss.apiOuss.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import ouss.apiOuss.Enums.HttpMethod;
import ouss.apiOuss.Repository.LogRepository;

import java.time.LocalDateTime;

@Entity
public class LogModel {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public LogModel(String description, HttpMethod method, LocalDateTime data) {
        this.description = description;
        this.method = method;
        this.data = data;
    }

    @Column(name="description", length=50, nullable=false, unique=false)
    private String description;

    @Column(name="httpMethod" , nullable=false, unique=false)
    private HttpMethod method;

    @Column(name="dataTime" ,nullable=false, unique=false)
    private LocalDateTime data;
}
