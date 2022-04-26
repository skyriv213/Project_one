package com.example.myspringapp.ToDoItem;

import com.example.myspringapp.ApiResponse.ApiResponse;
import lombok.Builder;

import java.util.List;

public class ToDoItemResponse extends ApiResponse<ToDoItem> {

    @Builder
    public ToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        super(toDoItem);
        this.setErrors(errors);
    }
}
