package com.loh.todo_api.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class TodoService {
    private static Logger logger = Logger.getLogger(TodoService.class.getName());
    @Autowired
    private TodoRepository todoRepository;

    /**
     * Retrieve to-do list
     * 
     * @return
     */
    public List<Todo> getMyTodoList() {
        List<Todo> todoList = todoRepository.getAll();
        return todoList;
    }

    /**
     * Add item to the list and return the id of the new item
     * 
     * @param todo
     * @return
     */
    public long addItemToThelist(Todo todo) {
        long todoId = 0;
        todoId = todoRepository.getLastItemID() + 1;
        todoRepository.insertTodo(todo, todoId);
        return todoId;

    }

    /**
     * Delete item from the list
     * 
     * @param id
     */
    public void deleteItem(long deleteTodoId) {
        todoRepository.deleteTodo(deleteTodoId);
        logger.info("Item removed from the list");
    }

    /**
     * Update to-do item
     * 
     * @param todoId
     * @param todo
     * @return
     */
    public Boolean updateTodoItem(long todoId, Todo todo) {

        // Retrieve the value you want to update
        Boolean updateStat = false;
        try {
            Todo updatedTodo = new Todo();

            updatedTodo.setTodoTitle(todo.getTodoTitle());
            updatedTodo.setTodoDescription(todo.getTodoDescription());
            updatedTodo.setTodoDate(todo.getTodoDate());
            updatedTodo.setComplete(todo.isComplete());
            todoRepository.updateTodo(updatedTodo, todoId);
            updateStat = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updateStat;

    }

    /**
     * Verify if the id provided is valid
     * 
     * @param todoId
     * @return
     */
    public boolean isTodoItemIdValid(long todoId) {
        return todoRepository.findById(todoId);
    }

    /**
     * returns number of items
     * 
     * @return
     */
    public long getNumberTodoItem() {
        return todoRepository.count();
    }

}
