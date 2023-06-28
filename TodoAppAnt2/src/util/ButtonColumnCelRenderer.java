package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author vanessadeoliveiramello
 */
public class ButtonColumnCelRenderer extends DefaultTableCellRenderer {
    
    private String buttonType;
    
    // Construtor
    public ButtonColumnCelRenderer(String buttonType){
        this.buttonType = buttonType;
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
        
        // Retorna o componente que será renderizado na tela, exibido no grid
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column);
        // Ícone que era alinhado a esquerda na celula, ficará centralizado
        label.setHorizontalAlignment(CENTER);
        // Aqui busca na pasta resources
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/"+buttonType+".png")));
        //label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/edit.png")));
        return label;
    }
    
    
}
