package com.likelion.springbootboard.controller;


import com.likelion.springbootboard.domain.entity.Board;
import com.likelion.springbootboard.ser.BoardSer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
public class BoardCon {

    private final BoardSer boardSer;

    public BoardCon(BoardSer boardSer) {
        this.boardSer = boardSer;
    }

    @GetMapping("/list")
    public String boardList(Model model){
        model.addAttribute("list", boardSer.boardList());
        return "list";
    }

    @GetMapping("/write")
    public String write(){
        return "write";
    }


        @GetMapping("/view") //view?id=1
        public String boardView(Model model,Long id){
            model.addAttribute("view",boardSer.boardView(id));
            return "view";
    }




    @PostMapping("")
    public String showWrite(/*String title, String contents*/Board board){

        //v1(write연동전)
        //board.getTitle 안됨 ==> entity가서 @getter
        //제목은 : null ==> @setter
        //        System.out.println("제목은 : "+board.getTitle());
        //        System.out.println("내용은은 : "+board.getContents());
        //        System.out.println("작성완료");


        ///write에서 제목 내용 쓴거 db에 저장
        boardSer.boardWrite(board);
        return "";
    }

}
