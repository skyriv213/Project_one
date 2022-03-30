package com.example.todolist.ToDoItem;

import org.springframework.stereotype.Service;

@Service // Service 어노테이션은 id를 받아 JPA Repository에 넣어줄 예정
public class ToDoItemService{
    // 데이터베이스가 없으니 임의의 값을 리턴
    public ToDoItem get(final String id){
        return ToDoItem.builder()
                .title("Add an id Validation")
                .build();
    }
}
