package kr.or.ddit.filter;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import kr.or.ddit.service.BoardService;
import kr.or.ddit.service.BoardServiceImpl;
import kr.or.ddit.vo.BoardVo;

public class EncodingFilter implements Filter{

	String enc;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		enc = filterConfig.getInitParameter("encode");
	}
	
	BoardService boardSerice = BoardServiceImpl.getInstacne();
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		if(req.getServletContext().getAttribute("cateList") !=null) {
			
		}
		else {
			List<BoardVo> cateList = boardSerice.cateList();
			System.out.println("cateList => "+cateList);
			req.getServletContext().setAttribute("cateList", cateList);
		}
		
		req.setCharacterEncoding(enc);
		resp.setCharacterEncoding(enc);
		
		chain.doFilter(req, resp);
		
	}
	
}
