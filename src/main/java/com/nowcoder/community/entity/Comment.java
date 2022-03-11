package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {

    private int id;             //id主键
    private int userId;         //评论者id
    private int entityType;     //评论的类型（评论的是帖子，还是帖子里的评论）
    private int entityId;       //帖子id
    private int targetId;       //评论的目标（向谁回复）
    private String content;
    private int status;
    private Date createTime;

}
