package com.example.ToDoList.ToDoItem;


import lombok.*;

@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoItem {
    private String id;
    private String title;
    private boolean done;
}

