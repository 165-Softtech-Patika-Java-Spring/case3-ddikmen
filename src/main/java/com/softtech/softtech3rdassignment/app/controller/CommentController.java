package com.softtech.softtech3rdassignment.app.controller;

import com.softtech.softtech3rdassignment.app.service.entityservice.CommentEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {

   private final CommentEntityService commentEntityService;

}
