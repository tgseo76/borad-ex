package com.likelion.springbootboard.ser;

import com.likelion.springbootboard.domain.entity.Board;
import com.likelion.springbootboard.repo.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardSer {

    private final BoardRepo boardRepo;

    @Autowired
    public BoardSer(BoardRepo boardRepo) {
        this.boardRepo = boardRepo;
    }


    //form에서 전송눌렀을때 dv에 저장
    public void boardWrite(Board board){
        boardRepo.save(board);
    }

    //db목록 보이기
    public List<Board> boardList(){
        return boardRepo.findAll();
    }

        //특정 id글 불러오기
        public Board boardView(Long id){
        return boardRepo.findById(id).get();
    }

    //특정 id 수정


    //특정 id 삭제
//    public void boardDel(Board board){
//    }
}
