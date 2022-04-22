package todo.SpringApp.ToDoItem;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor // 파라미터가 없는 생성자 생성
@AllArgsConstructor // 모든 필드값을 파라미터로 받는 생성자 생성
public class ToDoItem {
    private String id, title;
    private boolean done;
}
