package com.example.demo02.mybatiscatalog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


    @Mapper
    public interface CommentMapper {
        @Select("SELECT * FROM t_comment WHERE id =#{id}")
        public Comment findById(Integer id);


    }
