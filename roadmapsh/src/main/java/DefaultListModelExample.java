import javax.swing.DefaultListModel;
import javax.swing.JList;

public class DefaultListModelExample {
    public static void main(String[] args) {
        // Cria um DefaultListModel
        DefaultListModel<String> model = new DefaultListModel<>();

        // Adiciona elementos ao modelo
        model.addElement("Elemento 1");
        model.addElement("Elemento 2");
        model.addElement("Elemento 3");

        // Cria um JList e associa o modelo a ele
        JList<String> list = new JList<>(model);

        // Exibe a lista
        System.out.println("Elementos da lista:");
        for (int i = 0; i < model.getSize(); i++) {
            System.out.println(model.getElementAt(i));
        }
    }
}
