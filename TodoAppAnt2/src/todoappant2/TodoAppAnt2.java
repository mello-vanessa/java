package todoappant2;

import java.sql.SQLException;
import controller.*;
import java.util.List;
import model.*;
/**
 *
 * @author vanessadeoliveiramello
 */
public class TodoAppAnt2 {

    public static void main(String[] args) throws SQLException, Exception {
        ProjectController pc = new ProjectController();
        Project p = new Project();
        
        /*p.setNome("Arthur Project");
        p.setDescription("Projeto de vida do Arthur");
        pc.save(p);
        
        p.setId(9);
        p.setNome("Vanessa2");
        p.setDescription("Projeto de vida da Vanessa");
        pc.update(p);*/
        
        pc.removeById(1);

        List<Project> projetos = pc.getAll();
        System.out.println("Total de projetos: "+projetos.size());
                
        TaskController tc = new TaskController();
        Task t = new Task();
        /*t.setIdProject(9);
        t.setIsCompleted(false);
        t.setName("Tarefa do tutui");
        t.setNotes("Notas das tarefas do tutui");
        t.setDeadline(new Date());
        tc.save(t);*/
        /*
        t.setId(1);
        t.setIdProject(9);
        t.setName("Tarefa do Arthur");
        t.setDeadline(new Date());
        t.setDescription("Lista de tarefas do Arthur");
        tc.update(t);
        t.setName("Tarefa do Arthur");
        t.setIsCompleted(true);
        t.setNotes("Arhut não dormiu bem a noite.");
        t.update(t)
        */
        
        /*Task t2 = new Task();
        t2.setIdProject(9);
        t2.setIsCompleted(true);
        t2.setName("Tarefa da Vanessa");
        t2.setNotes("Notas das tarefas da Vanessa");
        t2.setDeadline(new Date());
        tc.save(t2);*/
        
        tc.removeById(1);
        
        List<Task> listaTarefas = tc.getAll(9);
        System.out.println("Total de tarefas: "+listaTarefas.size());
    }
}
