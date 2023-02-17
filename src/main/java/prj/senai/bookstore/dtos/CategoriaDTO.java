package prj.senai.bookstore.dtos;

import java.io.Serializable;

import prj.senai.bookstore.domain.Categoria;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public class CategoriaDTO implements Serializable {

    private static final long serialVersionUID = 1l;

    private Integer id;
	@NotEmpty(message = "Campo Nome é requerido")
	@Length(min=3,max=250, message = "O capo nome ter entre 3 entre 250 caracteres")
	private String nome;
	@NotEmpty(message = "Campo descrição é requerido")
	@Length(min=3,max=400, message = "O capo descrição ter entre 3 entre 400 caracteres")
	private String descricao;
    public CategoriaDTO() {
        super();
    }
    public CategoriaDTO(Categoria obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.descricao = obj.getDescricao();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
