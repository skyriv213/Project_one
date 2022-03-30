package com.example.todolist.ToDoItem;

import org.springframework.stereotype.Service;

@Service // Service 어노테이션은 id를 받아 JPA Repository에 넣어줄 예정
public class ToDoItemService{

    public ToDoItem get(final String id){
        return ToDoItem.builder()
                .title("Add an id Validation")
                .build();
    }
}
