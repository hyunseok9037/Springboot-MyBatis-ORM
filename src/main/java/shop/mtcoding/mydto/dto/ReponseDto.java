package shop.mtcoding.mydto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReponseDto<T> {
    private String msg;
    private T data;
}
