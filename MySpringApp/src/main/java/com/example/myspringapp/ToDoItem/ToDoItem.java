package com.example.myspringapp.ToDoItem;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoItem {
    private String id;
    private String title;
    private boolean done;
}
