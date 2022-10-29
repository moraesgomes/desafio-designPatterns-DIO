package desafio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface dadosPessoaFisicaRepository extends CrudRepository<dadosPessoaFisica, String> {

}
