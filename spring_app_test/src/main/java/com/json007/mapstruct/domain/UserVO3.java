package com.json007.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author: chao.an
 * @since: 2024-09-29 14:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVO3 {

    // 实体类该属性名是id
    private String userId;
    // 实体类该属性名是name
    private String userName;
    private String createTime;
    private String updateTime;

}
