/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.web.controller.Impl;

import com.kingland.bootcamp.common.SecurityConst;
import com.kingland.bootcamp.common.response.BaseResponse;
import com.kingland.bootcamp.web.controller.BrowserSecurityController;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
<<<<<<< HEAD
 * The BrowserSecurityController implements the interface
 *
 * @author KSC
=======
 * @author KSC
 *
>>>>>>> dev_branch
 */
@RestController
public class BrowserSecurityControllerImpl implements BrowserSecurityController {

    private RequestCache requestCache = new HttpSessionRequestCache();

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

<<<<<<< HEAD
    /**
     *
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
=======
>>>>>>> dev_branch
    @GetMapping(SecurityConst.AUTH_REQUIRE)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public BaseResponse requireAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SavedRequest savedRequest = requestCache.getRequest(request, response);
        if (savedRequest != null) {
            String targetUrl = savedRequest.getRedirectUrl();
<<<<<<< HEAD
            if (StringUtils.endsWithIgnoreCase(targetUrl, ".html"))
                redirectStrategy.sendRedirect(request, response, "/login.html");
        }
=======
//            log.info();
            if (StringUtils.endsWithIgnoreCase(targetUrl, ".html"))
                redirectStrategy.sendRedirect(request, response, "/login.html");
        }

>>>>>>> dev_branch
        return new BaseResponse("Accessed resources require identity authentication！");
    }
}
