package prj.senai.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import prj.senai.bookstore.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
    
}
