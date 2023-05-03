package com.easyapp.lp3.poo;
/*
Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe
deverá dispor dos seguintes métodos:
a. Construtor: define a data que determinado objeto (através de parâmetro), este
método verifica se a data está correta, caso não esteja a data é configurada 
como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a 
data corrente e retorne:
i. 0 se as datas forem iguais;
ii. 1 se a data corrente for maior que a do parâmetro;
iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso
caso contrário
h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da 
classe Data com os
mesmos valores de atributos e retorna sua referência pelo método
*/
import java.time.LocalDate;


public class Exercicio08 implements Cloneable{
    private int dia;
    private int mes;
    private int ano;
    
    public Exercicio08(int dia, int mes, int ano){
        if (ano >= 1 && mes >= 1 && mes <= 12 && dia >= 1) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Configurando para 01/01/0001.");
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
    }

    public int Compara(){
        if(this.getAno() == LocalDate.now().getYear()){
            if(this.getMes() == LocalDate.now().getMonthValue()){
                if(this.getDia() > LocalDate.now().getDayOfMonth()){
                    return -1;
                }
                else if(this.getDia() < LocalDate.now().getDayOfMonth()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
            else if (this.getMes() > LocalDate.now().getMonthValue()){
                return -1;
            }
            else {
                return 0;
            }
        }
        else if(this.getAno() > LocalDate.now().getYear()){
            return -1;
        }
        else{
            return 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getMesExtenso(){
        if(this.getMes() == 1){
            return "Janeiro";
        }
        else if(this.getMes() == 2){
            return "Fevereiro";
        }
        else if(this.getMes() == 3){
            return "Março";
        }
        else if(this.getMes() == 4){
            return "Abril";
        }
        else if(this.getMes() == 5){
            return "Maio";
        }
        else if(this.getMes() == 6){
            return "Junho";
        }
        else if(this.getMes() == 7){
            return "Julho";
        }
        else if(this.getMes() == 8){
            return "Agosto";
        }
        else if(this.getMes() == 9){
            return "Setembro";
        }
        else if(this.getMes() == 10){
            return "Outubro";
        }
        else if(this.getMes() == 11){
            return "Novembro";
        }
        else{
            return "Dezembro";
        }
    }
    
    public boolean IsBissexto(){
        if((this.getAno()%4==0 && this.getAno()%100!=0) || (this.getAno()%4==0 
                && this.getAno()%100==0 && this.getAno()%400==0)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public Exercicio08 clone(){
        Exercicio08 clone = new Exercicio08(this.getDia(), this.getMes(), this.getAno());
        return clone;
    }
    
    public String formataData(){
        return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
    }
    
    public static void main(String[] args) {
        Exercicio08 e08 = new Exercicio08(30, 12, 2024);
        int compara = e08.Compara();
        switch (compara) {
            case 0 -> 
                System.out.printf("As datas de hoje e do %s são iguais.",
                        e08.formataData());
            case 1 -> 
                System.out.printf("A data de hoje é maior que do parâmetro "
                        + "%s", e08.formataData());
            case -1 ->
                System.out.printf("A data de hoje é menor que do parâmetro "
                        + "%s", e08.formataData());
            default ->
                System.out.println("Retorno inválido.");
        }
        System.out.println(e08.getMesExtenso());
        System.out.println("Ano bissexto? "+e08.IsBissexto());
        Exercicio08 e09 = e08.clone();
        System.out.println("Clone: "+e09.formataData()); 
    }
}
