package com.example.todolist.ToDoItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // RESTful API를 위한 컨트롤러 클래스라고 알려주는 어노테이션
@RequestMapping("/todo") // 경로지정 어노테이션 해당 컨트롤러의 url을 정해준다
public class ToDoItemController {

    @Autowired //  자동으로 빈등록
    private ToDoItemService toDoItemService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}") // 어떤 REST 메서드를 사용할 것인지 어떤 경로인지 확인
    public @ResponseBody ToDoItemResponse get(@PathVariable(value = "id") String id){
        List<String> errors = new ArrayList<>();
        ToDoItem toDoItem = null;
        try{
            toDoItem = toDoItemService.get(id);
        } catch(final Exception e){
            errors.add(e.getMessage());
        }
        return ToDoItemAdapter.toToDoItemResponse(toDoItem, errors);
    }
}

//@ResponseBody  : HTTP Response Body 부분을 Json형태로 리턴할 것을 알려준다