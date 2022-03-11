package com.nowcoder.community.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Event {

    private String topic;       //主题名字
    private int userId;         //触发事件的人id
    private int entityType;     //帖子、评论类型
    private int entityId;       //帖子、评论等的id
    private int entityUserId;   //接收该事件的人id
    private Map<String, Object> data = new HashMap<>();

    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public Event setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public Event setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public Event setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public Event setEntityUserId(int entityUserId) {
        this.entityUserId = entityUserId;
        return this;
    }

    public Event  setData(String key, Object value) {
        this.data.put(key,value);
        return this;
    }
}
