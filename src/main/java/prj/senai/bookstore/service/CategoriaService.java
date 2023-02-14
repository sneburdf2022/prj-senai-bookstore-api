package prj.senai.bookstore.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prj.senai.bookstore.domain.Categoria;
import prj.senai.bookstore.dtos.CategoriaDTO;
import prj.senai.bookstore.exceptions.ObjetNotFoundException;
import prj.senai.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjetNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
    
    public List<Categoria> findAll(){
        return repository.findAll();
    }
    
    public Categoria create(Categoria obj){
        obj.setId(null);
        return repository.save(obj);
    }
    public Categoria update(Integer id, CategoriaDTO objDto){
        Categoria obj = findById(id);
        obj.setNome(objDto.getNome());
        obj.setDescricao(objDto.getDescricao());
        return repository.save(obj);
    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }
    
}
