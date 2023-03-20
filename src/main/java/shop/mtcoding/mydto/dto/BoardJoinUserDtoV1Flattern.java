package shop.mtcoding.mydto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardJoinUserDtoV1Flattern {
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdAt;
    private Integer userId;
    private String userUsername;
    private String userPassword;
    private String userEmail;
    private Timestamp uCreatedAt;

}
