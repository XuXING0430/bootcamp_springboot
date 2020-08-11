/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.web.controller;

import com.kingland.bootcamp.common.response.BaseResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author KSC
 *
 */
public interface BrowserSecurityController {

    BaseResponse requireAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException;

}
