package projetopessoal.projetotodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetopessoal.projetotodo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    Long Id(Long id);
}
