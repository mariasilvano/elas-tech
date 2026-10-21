package org.example.aula19;

public class BancoDeDadosFactory {

    public static BancoDeDados criar(int opcao){
        if(opcao == 1){
            return new MySql();
        }else if(opcao == 2) {
            return new MongoDB();
        }else if(opcao == 3) {
            return new Oracle();
        }else {
          throw new IllegalArgumentException();
        }
    }
}
