package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jogo {

	@Id
	@GeneratedValue
	private Integer Id;
	private Integer numero1;
	private Integer numero2;
	private Integer numero3;
	private Integer numero4;
	private Integer numero5;
	private Integer numero6;
	private String descricao;
	private Integer aux = 0;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}

	public Integer getNumero3() {
		return numero3;
	}

	public void setNumero3(Integer numero3) {
		this.numero3 = numero3;
	}

	public Integer getNumero4() {
		return numero4;
	}

	public void setNumero4(Integer numero4) {
		this.numero4 = numero4;
	}

	public Integer getNumero5() {
		return numero5;
	}

	public void setNumero5(Integer numero5) {
		this.numero5 = numero5;
	}

	public Integer getNumero6() {
		return numero6;
	}

	public void setNumero6(Integer numero6) {
		this.numero6 = numero6;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getAux() {
		return aux;
	}

	public void setAux(Integer aux) {
		this.aux = aux;
	}

}
