package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author vanessadeoliveiramello
 * Tem que mandar o JTable usar este renderizador, ao invés do padrão
 * no método decorarTabelaTarefas() no MainScreen.java
 */
public class DeadlineColumnCellRenderer extends DefaultTableCellRenderer{
    @Override
    // table o qual renderiza a celula, valor, se a cel tá selecionada...
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
        // Retorna o componente que será renderizado na tela, exibido no grid
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column);
        // Texto que era alinhado a esquerda na celula, ficará centralizado
        label.setHorizontalAlignment(CENTER);
        // AGORA QUERO PINTAR: VERMELHO TAREFA ATRASADA 
        //Pegar a tarefa da célula que to renderizando, primeiro puxo do tasktablemodel
        TaskTableModel tarefaTabelaModelo = (TaskTableModel) table.getModel();
        // Cepois puxo a tarefa de dentro do tasktablemodel
        // Esse row vem do parâmetro int row da função
        Task tarefa = tarefaTabelaModelo.getTarefas().get(row);
        // Se o prazo for depois de hoje, o prazo ainda não passou
        if(tarefa.getDeadline().after(new Date())){
            label.setBackground(Color.GREEN);
        } 
        else{
            label.setBackground(Color.RED);
        }
        return label;
    }
}
