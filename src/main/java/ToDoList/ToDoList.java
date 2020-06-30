package ToDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> toDoList = new ArrayList<String>();//待办事项
    private List<Boolean> isFilished = new ArrayList<Boolean>();//是否已完成

    public ToDoList() {
        toDoList.add("晚上有饭局");
        isFilished.add(false);
    }

    public boolean addNewWaitToDo(String waitToDo){
        if(toDoList.add(waitToDo)&&isFilished.add(false))return true;
        else return false;

    }
    public boolean doWaitToDo(int index){
        if(index<isFilished.size())
            return isFilished.set(index,true);
        else return false;
    }
    public boolean deleteWaitTodo(int index){
        if(index<toDoList.size()){
            toDoList.remove(index);
            isFilished.remove(index);
            return true;
        }
        else return false;
    }

}


