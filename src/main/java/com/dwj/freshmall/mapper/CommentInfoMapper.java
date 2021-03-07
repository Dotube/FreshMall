package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.CommentInfo;
import java.util.List;

public interface CommentInfoMapper {
    int deleteByPrimaryKey(String commentid);

    int insert(CommentInfo record);

    CommentInfo selectByPrimaryKey(String commentid);

    List<CommentInfo> selectAll();

    int updateByPrimaryKey(CommentInfo record);
}