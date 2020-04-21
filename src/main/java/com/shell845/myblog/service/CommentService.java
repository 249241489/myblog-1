package com.shell845.myblog.service;

import com.shell845.myblog.po.Comment;

import java.util.List;

/**
 * @author ych
 * @date 20/4/2020 6:52 PM
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
