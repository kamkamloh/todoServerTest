package com.loh.todo_api.todo;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TodoRepository extends CrudRepository<Todo, Long> {

        @Query(value = "SELECT * from todo.todo0_", nativeQuery = true)
        List<Todo> getAll();

        @Query(value = "SELECT todo_item_id FROM todo.todo0_ ORDER BY todo_item_id DESC LIMIT 1 ", nativeQuery = true)
        long getLastItemID();

        @Query(value = "Select IF(COUNT(*) > 0, 'true', 'false') from todo.todo0_ WHERE todo_item_id =:todoId", nativeQuery = true)
        Boolean findById(@Param("todoId") long todoId);

        @Transactional
        @Modifying
        @Query(value = "INSERT INTO todo.todo0_ (todo_item_id, todo_title, todo_description, is_complete, todo_date, creation_date, update_date) "
                        +
                        " VALUES( :todoId, :#{#td.todoTitle}, :#{#td.todoDescription}, :#{#td.complete}, :#{#td.todoDate}, NOW(), NOW()) ", nativeQuery = true)
        void insertTodo(@Param("td") Todo todoItem, @Param("todoId") long todoId);

        @Transactional
        @Modifying
        @Query(value = "UPDATE todo.todo0_ set todo_title =:#{#td.todoTitle}, todo_description =:#{#td.todoDescription}, is_complete =:#{#td.complete}, todo_date =:#{#td.todoDate} , update_date = NOW() where todo_item_id =:todoId ", nativeQuery = true)
        void updateTodo(@Param("td") Todo todoItem, @Param("todoId") long todoId);

        @Transactional
        @Modifying
        @Query(nativeQuery = true, value = "" +
                        "DELETE FROM todo.todo0_ where todo_item_id =:todoId ")
        void deleteTodo(@Param("todoId") long todoId);

}
