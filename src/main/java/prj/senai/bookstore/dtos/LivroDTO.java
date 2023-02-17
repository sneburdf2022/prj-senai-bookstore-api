package prj.senai.bookstore.dtos;

import java.io.Serializable;
import prj.senai.bookstore.domain.Livro;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public class LivroDTO implements Serializable {

    private static final long serialVersionUID = 1l;

    private Integer id;
    @NotEmpty(message = "Campo Título é requerido")
	@Length(min=3,max=150, message = "O capo Título ter entre 3 entre 150 caracteres")
	private String titulo;
	@NotEmpty(message = "Campo Nome Autor é requerido")
	@Length(min=3,max=100, message = "O capo Nome Autor ter entre 3 entre 100 caracteres")
	private String nome_autor;
	@NotEmpty(message = "Campo Texto é requerido")
	@Length(min=3,max=20000, message = "O capo Texto ter entre 3 entre 20000 caracteres")
	private String texto;

    
    public LivroDTO() {
        super();
    }

    public LivroDTO(Livro obj) {
        super();
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
        this.nome_autor = obj.getNome_autor();
        this.texto = obj.getTexto();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
