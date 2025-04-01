package br.unesp.rc.lista02exercicio02;

import br.unesp.rc.lista02exercicio02.modelo.Candidato;
import br.unesp.rc.lista02exercicio02.modelo.Eleitor;
import br.unesp.rc.lista02exercicio02.modelo.Voto;
import br.unesp.rc.lista02exercicio02.repositorio.CandidatoRepositorio;
import br.unesp.rc.lista02exercicio02.repositorio.EleitorRepositorio;
import br.unesp.rc.lista02exercicio02.repositorio.VotoRepositorio;
import java.util.Date;

/**
 *
 * @author User
 */
public class Lista02Exercicio02 {

    public static void main(String[] args) {
        Candidato c1 = new Candidato(1, "Fulano da Silva", "PSDB");
        Candidato c2 = new Candidato(2, "Beltrado da Costa", "PT");
        Candidato c3 = new Candidato(3, "Ciclano do Amaral", "MDB");
        Candidato c4 = new Candidato(4, "Branco", "");
        Candidato c5 = new Candidato(5, "Nulo", "");
        
        CandidatoRepositorio crep = new CandidatoRepositorio();
        crep.adicionar(c1);
        crep.adicionar(c2);
        crep.adicionar(c3);
        crep.adicionar(c4);
        crep.adicionar(c5);
        crep.imprimir();        
        //---
        System.out.println("---");
        //---
        Eleitor e1 = new Eleitor("Hary Deitel", "Avenida Java, 1992", 2, "data", "casado", "Privado", 1000);
        Eleitor e2 = new Eleitor("Deitel Deitel", "Rua Java, 1992", 0, "data" , "solteiro", "Privado", 5000);
        Eleitor e3 = new Eleitor("Java Man", "Alameda Java, 1992", 3, "data", "casado", "Privado", 1400);
        Eleitor e4 = new Eleitor("Man Java", "Alvorada Java, 1992", 2, "data", "casado", "Privado", 1200);
        Eleitor e5 = new Eleitor("Python No!", "kkkkkk, 2024", 0, "data", "solteiro", "Público", 20000);
        
        EleitorRepositorio erep = new EleitorRepositorio();
        erep.adicionar(e1);
        erep.adicionar(e2);
        erep.adicionar(e3);
        erep.adicionar(e4);
        erep.adicionar(e5);
        erep.imprimir();
        //---
        System.out.println("---");
        //---
        Voto v1 = new Voto(e1, c1, new Date());
        Voto v2 = new Voto(e2, c2, new Date());
        Voto v3 = new Voto(e3, c3, new Date());
        Voto v4 = new Voto(e4, c4, new Date());
        Voto v5 = new Voto(e5, c5, new Date());
        
        VotoRepositorio vrep =  new VotoRepositorio();
        vrep.adicionar(v1);
        vrep.adicionar(v2);
        vrep.adicionar(v3);
        vrep.adicionar(v4);
        vrep.adicionar(v5);
        vrep.imprimir();
    }
}
