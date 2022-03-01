package com.softtech.softtech3rdassignment.app.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COMMENT")
@Getter
@Setter
public class Comment {

    @Id
    @SequenceGenerator(name = "Comment", sequenceName = "COMMENT_ID_SEQ")
    @GeneratedValue(generator = "Comment")
    private Long id;

    @Column(name = "COMMENT_DESCRIPTION", nullable = false, length = 250)
    private String comment;

}
