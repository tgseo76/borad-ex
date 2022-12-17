package com.likelion.springbootboard.controller;

import com.likelion.springbootboard.domain.dto.MemberDto;
import com.likelion.springbootboard.domain.entity.Member;
import com.likelion.springbootboard.ser.MemberSer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/api/v1/member")
public class MemberController {
    private final MemberSer memberSer;

    public MemberController(MemberSer memberSer) {
        this.memberSer = memberSer;
    }

    
    //회원가입 페이지
    @GetMapping("/join")
    public String joinPage(){
        return "join";
    }
    
    //회원가입 정보db저장
    @PostMapping("/join")
    public String joinMember(MemberDto memberDto){
        memberSer.save(memberDto);
        return "redirect:/api/v1/member/login";
//        return "login";
    }

    //로그인페이지
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    //로그인 성공&실패
    @PostMapping("/login")
    public String login(@ModelAttribute MemberDto memberDto, HttpSession httpSession) {
        MemberDto logResult = memberSer.login(memberDto);
        if (logResult!=null){
            //성공
            httpSession.setAttribute("id",logResult.getId());  //로그인한 회원 세션정보
            return "main";
        }else {
            //실패
            return "loginFail";
        }
    }
}
