package prj.senai.bookstore.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prj.senai.bookstore.domain.Livro;
import prj.senai.bookstore.dtos.LivroDTO;
import prj.senai.bookstore.exceptions.ObjetNotFoundException;

import prj.senai.bookstore.repositories.LivroRepository;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    @Autowired
    private CategoriaService categoriaServico;

    public Livro findById(Integer id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjetNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Livro.class.getName()));
    }

    public List<Livro> findAll(Integer id_cat) {
        categoriaServico.findById(id_cat);
        return repository.findAllByCategoria(id_cat);
    }

    public Livro create(Livro obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public Livro update(Integer id, LivroDTO objDto) {
        Livro obj = findById(id);
        obj.setNome_autor(objDto.getNome_autor());
        obj.setTexto(objDto.getTexto());
        obj.setTitulo(objDto.getTitulo());
        return repository.save(obj);
    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);

    }

}
