package th.co.dtac.mobile.rtr.filter;

/**
 * Created by amanurat on 4/6/2016 AD.
 */

import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

@WebFilter( filterName = "mdcFilter", urlPatterns = { "/*" } )
public class MDCFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter( final ServletRequest request, final ServletResponse response, final FilterChain chain )
            throws IOException, ServletException {

        // Get the parameter value.
//        final String parameter = request.getParameter( "clientName" );

        // Put it in the MDC map.
        MDC.put( "requestId", UUID.randomUUID().toString().toUpperCase());


        MDC.put("client", request.getRemoteAddr());
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        MDC.put("requestURL", httpServletRequest.getRequestURI());

        try {
            chain.doFilter( request, response );
        } finally {
            // When the control returns to the filter, clean it.
            MDC.remove( "requestId" );
            MDC.remove( "client" );
            MDC.remove( "requestURL" );
        }
    }

    @Override
    public void init( final FilterConfig filterConfig ) throws ServletException {

    }
}