package prj.senai.bookstore.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prj.senai.bookstore.domain.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}