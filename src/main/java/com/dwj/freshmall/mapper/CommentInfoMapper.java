package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.CommentInfo;
import java.util.List;

public interface CommentInfoMapper {
    int deleteByPrimaryKey(Integer commentid);

    int insert(CommentInfo record);

    CommentInfo selectByPrimaryKey(Integer commentid);

    List<CommentInfo> selectAll();

    int updateByPrimaryKey(CommentInfo record);
}