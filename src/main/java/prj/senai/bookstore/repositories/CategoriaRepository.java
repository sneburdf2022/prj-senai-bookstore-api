package prj.senai.bookstore.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import prj.senai.bookstore.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}