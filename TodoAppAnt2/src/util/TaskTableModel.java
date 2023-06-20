package util;

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
    // Retorna o valor que existe em tal linha e coluna
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            //Para coluna 1, retorna o nome da tarefa, a 2, a descrição e assim por diante
            case 1 -> {
                return tarefas.get(rowIndex).getName();
            }
            case 2 -> {
                return tarefas.get(rowIndex).getDescription();
            }
            case 3 -> {
                return tarefas.get(rowIndex).getDeadline();
            }
            case 4 -> {
                //depois tem que ajeitar pra converter para date
                return tarefas.get(rowIndex).isCompleted();
            }
            case 5 -> {
                return "";
            }
            case 6 -> {
                return "";
            }
            default -> throw new AssertionError();
        }
    }
    
}
