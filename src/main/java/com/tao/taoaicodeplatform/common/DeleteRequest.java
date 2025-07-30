package com.tao.taoaicodeplatform.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除封装类
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
