package org.fuji.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.fuji.entity.User;


/**
 * @Author Nick
 * @CreateTime 2020/10/4
 */
@Mapper
public interface UserMapper {
    User getUserById(String id);
}
