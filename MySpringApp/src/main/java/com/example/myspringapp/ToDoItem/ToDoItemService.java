package com.example.myspringapp.ToDoItem;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class ToDoItemService {

    public ToDoItem get(final String id) {
        return ToDoItem.builder()
                .title("Add an id validation")
                .build();
    }
}
