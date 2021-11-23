package com.zgw.blog.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class ArticleCategoryRef implements Serializable {

    private static final long serialVersionUID = 7030570213200390694L;
    //文章id
    private Integer articleId;
    //分类id
    private Integer categoryId;

    public ArticleCategoryRef() {
    }

    public ArticleCategoryRef(Integer articleId, Integer categoryId) {
        this.articleId = articleId;
        this.categoryId = categoryId;
    }
}
