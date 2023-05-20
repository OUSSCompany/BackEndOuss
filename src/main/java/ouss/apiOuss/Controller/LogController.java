package ouss.apiOuss.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ouss.apiOuss.Enums.HttpMethod;
import ouss.apiOuss.Models.LogModel;
import ouss.apiOuss.Repository.LogRepository;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/log")
public class LogController {
    LogRepository LogDataBase;
    public void createModeLog(String description, HttpMethod method){
        LocalDateTime dataNow = LocalDateTime.now();
        LogModel newLog = new LogModel(description , method , dataNow);
        LogDataBase.save(newLog);
    }
}
