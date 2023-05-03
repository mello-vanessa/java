
package com.easyapp.lp3.poo;

/*
Construa uma classe para representar um carro. O tanque de combustível do carro 
armazena no máximo 50 litros de gasolina. O carro consome 15 km/litro. Deve ser 
possível:
a. Abastecer o carro com certa quantidade de gasolina;
b. Mover o carro em uma determinada distância (medida em km);
c. Retornar a quantidade de combustível e a distância total percorrida.
No programa principal, crie 2 carros. Abasteça 20 litros no primeiro e 30 litros
no segundo. Desloque o primeiro em 200 km e o segundo em 400 km. Exiba na tela a
distância percorrida e o total de combustível restante para cada um. 
*/
public class Exercicio16 {
    private double tanqueMax;
    private double kmMax;
    private double abastecimentoLitros;
    private double deslocamentoKm;
    
    public Exercicio16(){
        this.abastecimentoLitros = 0;
        this.deslocamentoKm = 0;
        this.tanqueMax = 50;
        this.kmMax = 750;
    }
    
    public void abastecerCarro(double abastecimentoLitros){
        this.abastecimentoLitros = abastecimentoLitros;
    }
    public void deslocarCarro(double deslocamentoKm){
        this.deslocamentoKm = deslocamentoKm;
    }
    public double calcularDistanciaPercorrida(){
        if(this.abastecimentoLitros == 0 ){
            throw new IllegalArgumentException("Não permitida divisão por zero.");
        }
        else{
            return this.deslocamentoKm / this.abastecimentoLitros;
        }
    }
    
    public static void main(String[] args) {
        Exercicio16 carro01 = new Exercicio16();
        Exercicio16 carro02 = new Exercicio16();
        carro01.abastecerCarro(20);
        carro02.abastecerCarro(30);
        carro01.deslocarCarro(200);
        carro02.deslocarCarro(400);
        try{
            System.out.println("Dist perc carro01: "+carro01.calcularDistanciaPercorrida());
            System.out.println("Dist perc carro02: "+carro02.calcularDistanciaPercorrida());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

