package com.example.todolist.ApiResponse;

/*http response에 포함되어 브라우저로 전달 될 모델
리퀘스트와 마찬가지로 모델을 그대로 브라우저에 전달하는 것은 비즈니스 로직의 공개와 같다
따라서 리스폰스 클래스로 감싸는게 좋다
response의 경우 에러 메세지가 들어가므로 항상 모델과 같지않다.
그래서 response 클래스를 만들고 그 내부에 모델 클래스(ToDoItem)와 부가적으로 UI가 필요한 정보를 넣어준다*/

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter // lombok의 코드를 줄여주는 Getter, Setter 메서드
@RequiredArgsConstructor
public abstract class ApiResponse<T> {
    // 데이터 타입을 따로 정의해주지않아서 어떤 타입이든 들어갈 수 있다.
    @NonNull private T data;
    // 이 추상클래스를 상속 받는 서브 클래스들은 항상 error라는 리스트를 가지고 있다.
    private List<String> errors;

}

