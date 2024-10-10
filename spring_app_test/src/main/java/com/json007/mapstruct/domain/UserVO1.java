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
public class UserVO1 {

    private Integer id;
    private String name;
    private String createTime;
    private LocalDateTime updateTime;

}
