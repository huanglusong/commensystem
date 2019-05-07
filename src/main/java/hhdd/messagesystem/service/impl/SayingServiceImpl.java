package hhdd.messagesystem.service.impl;

import hhdd.messagesystem.bean.Saying;
import hhdd.messagesystem.mapper.SayingMapper;
import hhdd.messagesystem.service.SayingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SayingServiceImpl implements SayingService {

    @Autowired
    private SayingMapper mapper;

    @Override
    public Saying selectOneById(int id) {
        return mapper.selectOneById(id);
    }

    @Override
    public void upadateLikesById(int SayingId, String likes) {
        mapper.updateLikesById(SayingId,likes);
    }
}
