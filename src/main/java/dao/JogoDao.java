package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidade.Jogo;
import util.JPAUtil;

public class JogoDao {

	public static void salvar(Jogo j) {
		EntityManager em = JPAUtil.criandoEM();
		em.getTransaction().begin();
		em.persist(j);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Jogo j) {
		EntityManager em = JPAUtil.criandoEM();
		em.getTransaction().begin();
		j = em.find(Jogo.class, j.getId());
		em.remove(j);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Jogo> listar(){
		EntityManager em = JPAUtil.criandoEM();
		Query q = em.createQuery("select j from Jogo j");
		@SuppressWarnings("unchecked")
		List<Jogo> result = q.getResultList();
		em.close();
		return result;
		
	}
}
