package com.json007.mapstruct.extend;

import com.json007.mapstruct.domain.UserVO1;
import com.json007.mapstruct.domain.UserVO2;
import com.json007.mapstruct.domain.UserVO3;
import org.mapstruct.Mapper;

/**
 * @author: chao.an
 * @since: 2024-09-29 14:57
 */
@Mapper(componentModel = "spring")
public interface UserConvertExtends extends BasicConvertObject<UserVO1, UserVO2> {

    UserVO3 toConvertVO3(UserVO1 userVO1);
}
