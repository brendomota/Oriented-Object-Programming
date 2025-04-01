package br.unesp.rc.lista02exercicio03;

import br.unesp.rc.lista02exercicio03.modelo.PlanoNormal;
import br.unesp.rc.lista02exercicio03.modelo.PlanoPlus;
import br.unesp.rc.lista02exercicio03.modelo.PlanoVip;
import br.unesp.rc.lista02exercicio03.modelo.Socio;
import br.unesp.rc.lista02exercicio03.utilitario.Texto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Lista02Exercicio03 {

    public static void main(String[] args) {
        List<Socio> socios = new ArrayList<>();

        Socio socio1 = new Socio();
        socio1.setNome("Cecília Costa");
        socio1.setCpf("81861524404");
        socio1.setPlano(new PlanoNormal());
        socios.add(socio1);

        Socio socio2 = new Socio();
        socio2.setNome("Vitor Caldeira");
        socio2.setCpf("34598796960");
        socio2.setPlano(new PlanoVip());
        socios.add(socio2);

        Socio socio3 = new Socio();
        socio3.setNome("Valentina Cardoso");
        socio3.setCpf("28485912268");
        socio3.setPlano(new PlanoPlus());
        socios.add(socio3);

        Texto.desenharLinha();
        for (Socio socio : socios) {
            System.out.printf(
                    "Nome: %s - CPF: %s - Plano: %s (mensalidade de R$ %.2f)\n",
                    socio.getNome(),
                    socio.getCpf(),
                    socio.getPlano().getNome(),
                    socio.getPlano().getValorMensal()
            );
        }
        Texto.desenharLinha();
        System.out.println("");
    }
}
