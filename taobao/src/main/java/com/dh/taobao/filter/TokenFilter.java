package com.dh.taobao.filter;

import com.dh.taobao.constant.PassUrl;
import com.dh.taobao.constant.SYS;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author DH
 */
@Component
public class TokenFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
//
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        if(!PassUrl.list.contains(request.getServletPath())){
//            // 拦截接口校验token
//            String tokenKey = request.getHeader("Authorization");
//            if(StringUtils.isBlank(tokenKey)){
//                this.unLogin(response);
//                return;
//            }
//        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

    /**
     * 未登录返回错误信息
     * @param response
     * @throws IOException
     */
    private void unLogin(HttpServletResponse response) throws IOException {
        StringBuffer buf = new StringBuffer();
        buf.append("{\"code\":\"" + SYS.E00001.name() + "\",\"msg\":\"" + SYS.E00001.getValue() + "\",\"data\":" + new HashMap<>() + "}");
        response.setHeader("Content-type", "text/plain;charset=UTF-8");
        response.getOutputStream().write(buf.toString().getBytes());
        response.getOutputStream().flush();
    }


}
