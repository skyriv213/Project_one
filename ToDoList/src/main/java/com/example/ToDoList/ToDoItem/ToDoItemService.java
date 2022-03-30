package com.example.ToDoList.ToDoItem;


import org.springframework.stereotype.Service;

@Service
public class ToDoItemService {

    public ToDoItem get(final String id) {
// do id validation
        return ToDoItem.builder()
                .title("Add an id validation")
                .build();
    }

}

