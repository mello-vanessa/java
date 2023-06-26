package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author vanessadeoliveiramello
 */
public class TaskTableModel extends AbstractTableModel{

    // Vetor do tipo string com as colunas
    String[] colunas = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    // Uma lista que guarda Task chamada tarefas
    List<Task> tarefas = new ArrayList<>();
    
    @Override
    // Quantas tarefas eu já tenho
    public int getRowCount() {
        //vai retornar a quantidade de acordo com a lista de tarefas que eu tiver
        return tarefas.size();
    }

    @Override
    // Quantas colunas eu tenho
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex == 3;
        /* A linha de cima substitui tudo do comentário
        if(columnIndex == 3)
            return true;
        else
            return false;*/
    }
    //Retorna a classe do componente da coluna x
    // Se é um texto, boolean.... Por padrão do pai, retorna uma string
    // Por isso retorna true e false, retorna so um textinho
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        // Se não tem nada que venha do banco de dados
        if (tarefas.isEmpty()) {
            return Object.class;
        }
        // Verifica se rowIndex é válido antes de acessar getValueAt(0, columnIndex)
        // para não gerar erro de null pointer
        // java.lang.NullPointerException: Cannot invoke "Object.getClass()" /
        //because the return value of "util.TaskTableModel.getValueAt(int, int)" is null
        if (!tarefas.isEmpty()) {
            return this.getValueAt(0, columnIndex).getClass();
        }

        // Retorna o tipo padrão caso o ArrayList esteja vazio
        return Object.class;
    }

    /*public Class<?> getColumnClass(int columnIndex){
        // Se não tem nada que venha do banco de dados
        if(tarefas.isEmpty() || columnIndex == 0){
            return Object.class;
        }
        //pega a linha 0 e vai percorrendo as colunas e retornando o tipo de dado de cada uma
        // por exemplo, no caso do boolean, ele ja retorna um quadradinho de checked
        return this.getValueAt(0, columnIndex).getClass();
    }*/

    @Override
    // Para poder transformar o true/false txt em campo de check
    // Retorna o valor que existe em tal linha e coluna
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            //Para coluna 1, retorna o nome da tarefa, a 2, a descrição e assim por diante
            case 0 -> {
                return tarefas.get(rowIndex).getName();
            }
            case 1 -> {
                return tarefas.get(rowIndex).getDescription();
            }
            case 2 -> {
                SimpleDateFormat correcaoData = new SimpleDateFormat("dd/MM/yyyy");
                return correcaoData.format(tarefas.get(rowIndex).getDeadline());
            }
            case 3 -> {
                //depois tem que ajeitar pra converter para date
                return tarefas.get(rowIndex).isCompleted();
            }
            case 4 -> {
                return "";
            }
            case 5 -> {
                return "";
            }
            default -> throw new AssertionError("Dados não encontrados.");
        }
    }
    
    @Override
    //Setar o campo de check, para poder alterar e dizer se tá ou não concluída
    // recebe um object o valor setado no campo, entao se eu check, vai receber 
    // um true, se descheckar, recebe um falso
    // Ae o metodo setIsCompleted espera exatamente um true ou false
    // a tela da interface transforma o meu boolean em object, por isso que aqui
    // eu recebo Object e tenho de reconverter (casting) boolean
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        //Muda só o componente gráfico
        tarefas.get(rowIndex).setIsCompleted((boolean) aValue);
        // Aqui salva no banco de dados
    }
    

    public String[] getColunas() {
        return colunas;
    }

    public List<Task> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Task> tarefas) {
        this.tarefas = tarefas;
    }

}
