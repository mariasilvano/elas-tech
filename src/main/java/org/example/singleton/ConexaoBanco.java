package org.example.singleton;

public class ConexaoBanco {
    private static ConexaoBanco instancia;

    //Contrutor PRIVADO
    private ConexaoBanco(){

    }

    //Getter PÚBLICO
    public static ConexaoBanco getInstancia(){
        if(instancia == null){
            instancia = new ConexaoBanco();
        }

        return instancia;
    }
}
