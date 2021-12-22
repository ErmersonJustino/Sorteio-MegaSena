package bean;

import java.util.List;
import java.util.Random;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.JogoDao;
import entidade.Jogo;

@ManagedBean
public class JogoBean {
	private Jogo jogo = new Jogo();
	private List<Jogo> jogos;

	private Integer count = 0;

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public List<Jogo> getJogos() {
		if (jogos == null) {
			jogos = JogoDao.listar();
		}
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String gerarSalvar() {
		Random aleatorio = new Random();
		jogo.setNumero1(aleatorio.nextInt(60) + 1);
		jogo.setNumero2(aleatorio.nextInt(60) + 1);
		jogo.setNumero3(aleatorio.nextInt(60) + 1);
		jogo.setNumero4(aleatorio.nextInt(60) + 1);
		jogo.setNumero5(aleatorio.nextInt(60) + 1);
		jogo.setNumero6(aleatorio.nextInt(60) + 1);
		jogo.setDescricao("Concurso " + numConcurso());

		JogoDao.salvar(jogo);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Os numeros foram gerados"));
		setJogos(JogoDao.listar());
		jogo = new Jogo();
		return null;
	}

	public String excluir() {
		JogoDao.excluir(jogo);
		jogos.remove(jogo);
		jogo = new Jogo();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso,", "Dados excluido"));
		return null;
	}

	public Integer numConcurso() {
		
		for(Jogo j: JogoDao.listar()) {
			if(j.getAux() == 0) {
				this.count = count + 1;
			}
		}
		return count;
	}

}
