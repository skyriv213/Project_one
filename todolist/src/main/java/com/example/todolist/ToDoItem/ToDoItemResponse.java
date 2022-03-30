package com.example.todolist.ToDoItem;

import com.example.todolist.ApiResponse.ApiResponse;
import lombok.Builder;
import lombok.NonNull;

import java.util.List;


public class ToDoItemResponse extends ApiResponse<ToDoItem> {

    @Builder
    public ToDoItemResponse(final ToDoItem toDoItem, final List<String> errors){
        super(toDoItem);
        this.setErrors(errors);
    }


}
