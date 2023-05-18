package ouss.apiOuss.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ouss.apiOuss.Models.LogModel;

@Repository
public interface LogRepository extends CrudRepository<LogModel , Integer> {



}
