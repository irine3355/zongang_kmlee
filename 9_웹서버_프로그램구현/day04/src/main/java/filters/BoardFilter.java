package filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;

import java.io.IOException;

/*
@WebFilter(value = "/board", initParams = {
        @WebInitParam(name="key1", value = "value1"),
        @WebInitParam(name="key2", value = "value2") })
*/
public class BoardFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 1. 필터 초기화 매개변수 "k1"의 값을 가져옵니다.
        String k1 = filterConfig.getInitParameter("k1");
        // 2. 필터 초기화 매개변수 "k2"의 값을 가져옵니다.
        String k2 = filterConfig.getInitParameter("k2");
        // 3. "k1"과 "k2" 값을 콘솔에 출력합니다.
        System.out.printf("k1=%s, k2=%s%n", k1, k2);

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter()!");
        System.out.println("응답 전 필터");
        chain.doFilter(request, response); // 다음 필터 또는 서블릿의 처리 메서드 실행
        System.out.println("응답 후 필터");
    }
}
