package com.lizhangjun;

import org.apache.ibatis.annotations.Select;

public interface StudentMapper {

    @Select("SELECT * FROM student WHERE id = #{id}")
    Student selectBlog(int id);
}
