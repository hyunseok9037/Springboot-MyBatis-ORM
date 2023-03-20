package shop.mtcoding.mydto.model.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.mydto.dto.BoardJoinUserDtoV1Flattern;
import shop.mtcoding.mydto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.mydto.dto.BoardJoinUserDtoV3;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public Board findByUsernameAndPassword(Board board);

    public BoardJoinUserDtoV1Flattern findByIdJoinUserV1(int id);

    public BoardJoinUserDtoV2 findByIdJoinUserV2(int id);

    public BoardJoinUserDtoV3 findByIdJoinUserV3(int id);
}