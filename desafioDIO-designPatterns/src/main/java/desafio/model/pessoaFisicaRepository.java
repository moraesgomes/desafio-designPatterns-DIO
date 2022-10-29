package desafio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pessoaFisicaRepository extends CrudRepository<pessoaFisica, Long > {

}
