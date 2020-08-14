/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.web.controller.Impl;

import com.kingland.bootcamp.common.consts.MessageConst;
import com.kingland.bootcamp.common.consts.SecurityConst;
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
 * The BrowserSecurityController implements the interface
 *
 * @author KSC
 */
@RestController
public class BrowserSecurityControllerImpl implements BrowserSecurityController {

    private RequestCache requestCache = new HttpSessionRequestCache();

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    /**
     *
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @GetMapping(SecurityConst.AUTH_REQUIRE)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public BaseResponse requireAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SavedRequest savedRequest = requestCache.getRequest(request, response);
        if (savedRequest != null) {
            String targetUrl = savedRequest.getRedirectUrl();
            if (StringUtils.endsWithIgnoreCase(targetUrl, ".html"))
                redirectStrategy.sendRedirect(request, response, SecurityConst.AUTH_Login);
        }
        return new BaseResponse(MessageConst.DO_NOT_HAVE_ACCESS);
    }
}
