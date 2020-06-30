import ToDoList.ToDoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class APPTest {
    @Test
    public void whenAddNewWaitToDo(){
        ToDoList todo = new ToDoList();
        boolean returnResult =todo.addNewWaitToDo("下午写作业");
        Assertions.assertEquals(true,returnResult);
    }
    @Test
    public void whenDel1(){
        ToDoList todo = new ToDoList();
        boolean returnResult = todo.deleteWaitTodo(0);
        Assertions.assertEquals(true,returnResult);
    }
    @Test
    public void whenDel2(){
        ToDoList todo = new ToDoList();
        boolean returnResult = todo.deleteWaitTodo(2);
        Assertions.assertEquals(false,returnResult);
    }
    @Test
    public void whenDoWaitToDo(){
        ToDoList todo = new ToDoList();
        boolean returnResult = todo.doWaitToDo(2);
        Assertions.assertEquals(false,returnResult);
    }

}
