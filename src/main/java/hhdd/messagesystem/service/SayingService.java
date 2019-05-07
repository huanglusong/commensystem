package hhdd.messagesystem.service;

import hhdd.messagesystem.bean.Saying;

public interface SayingService {
    Saying selectOneById(int id);
    void upadateLikesById(int SayingId,String likes);
}
