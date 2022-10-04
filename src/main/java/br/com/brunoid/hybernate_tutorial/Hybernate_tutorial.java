package br.com.brunoid.hybernate_tutorial;

import br.com.brunoid.controllers.PessoaController;


public class Hybernate_tutorial {

    public static void main(String[] args) {
        System.out.println("Estudo de Hibernate");
        
        PessoaController ctl = new PessoaController();
        ctl.setup();
        ctl.read();
        ctl.exit();
    }
}
