package com.softtech.softtech3rdassignment.app.service.entityservice;

import com.softtech.softtech3rdassignment.app.dao.CommentDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentEntityService {

    private final CommentDao commentDao;

}
