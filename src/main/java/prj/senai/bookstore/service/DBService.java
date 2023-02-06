package prj.senai.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prj.senai.bookstore.domain.Categoria;
import prj.senai.bookstore.domain.Livro;
import prj.senai.bookstore.repositories.CategoriaRepository;
import prj.senai.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepositoru;

	public void instanciaBaseDeDados() {

		Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Ficção Científica");
		Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografias");

		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem insum", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Louis V.Gerstner", "Lorem insum", cat1);
		Livro l3 = new Livro(null, "The Time MAchine", "H.G Wells", "Lorem insum", cat2);
		Livro l4 = new Livro(null, "The War of the Worlds", "H.G Wells", "Lorem insum", cat2);
		Livro l5 = new Livro(null, "I, Robot", "Isaac Asimov", "Lorem insum", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepositoru.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}

}
