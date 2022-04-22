package todo.SpringApp.ToDoItem;

import lombok.Builder;
import todo.SpringApp.ApiResponse.ApiResponse;

import java.util.List;


public class ToDoItemResponse extends ApiResponse<ToDoItem> {
    @Builder
    public ToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        super(toDoItem);
        this.setErrors(errors);

    }
}
