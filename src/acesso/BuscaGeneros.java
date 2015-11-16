/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acesso;

import entidades.Generos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author a1562339
 */
public class BuscaGeneros {
    
    public static void main(String[] args) {
        //1
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LivrariaPU");
        //2
        EntityManager em = emf.createEntityManager();
        Generos g = em.find(Generos.class, 2);
        //3
        if(g != null){
            System.out.println(g.getGENERO_ID() +", "+g.getDEESCRICAO());
        }else{
            System.out.println("Não encontrado!");
        }
        
    }
}
