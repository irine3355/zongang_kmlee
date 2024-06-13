package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member/*")
public class MemberController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mode = getMode(req);
        if (mode.equals("join")) {
            joinForm(req, resp);
        } else if (mode.equals("login")) {
            loginForm(req, resp);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mode = getMode(req);
        if (mode.equals("join")) {
            joinProcess(req, resp);
        } else if (mode.equals("login")) {
            loginProcess(req, resp);
        }
    }

    private String getMode(HttpServletRequest req) {
// 1. 요청 URI를 가져옵니다.
        String url = req.getRequestURI();
        // 2. 슬래시('/')를 기준으로 URI를 분리하여 배열로 만듭니다.s
        String[] urls = url.split("/");
        // 3. 배열의 마지막 요소를 추출합니다.
        //    배열의 길이가 0보다 크다면 마지막 요소를 반환하고,
        //    그렇지 않다면 빈 문자열을 반환합니다.
        String mode = urls.length > 0 ? urls[urls.length - 1] :"";

        return mode;

    }

    // 회원 가입 양식
    private void joinForm(HttpServletRequest req, HttpServletResponse resp)throws  IOException{
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>회원가입</h1>");
    }

    // 로그인 양식
    private void loginForm(HttpServletRequest req, HttpServletResponse resp)throws  IOException{
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>로그인</h1>");
    }

    // 회원 가입 처리
    private void  joinProcess(HttpServletRequest req, HttpServletResponse resp){

    }

    // 로그인 처리
    private void loginProcess(HttpServletRequest req, HttpServletResponse resp){

    }
}
