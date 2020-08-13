/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Response
 *
 * @author KSC
 */
@Getter
@Setter
@AllArgsConstructor
public class BaseResponse {

    public BaseResponse(Object content) {

        this.content = content;
    }

    private Object content;

    public Object getContent() {

        return content;
    }

    public void setContent(Object content) {

        this.content = content;
    }
}
