package com.circle.service;

import com.circle.dto.Result;
import com.circle.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 探店笔记接口
 * @Author israein
 * @date 20:09 2023/5/31
 **/
public interface IBlogService extends IService<Blog> {
    /**
     * 保存探店笔记
     * @Author israein
     * @date 20:32 2023/5/31
     * @param blog
     * @return com.dzdp.dto.Result
     **/
    Result saveBlog(Blog blog);

    /**
     * 根据id查询探店笔记
     * @Author israein
     * @date 20:08 2023/5/31
     * @param id
     * @return com.dzdp.dto.Result
     **/
    Result queryBlogById(Long id);

    /**
     * 点赞
     * @Author israein
     * @date 20:38 2023/5/31
     * @param id
     * @return com.dzdp.dto.Result
     **/
    Result likeBlog(Long id);

    /**
     * 查询我的探店笔记
     * @Author israein
     * @date 20:39 2023/5/31
     * @param current
     * @return com.dzdp.dto.Result
     **/
    Result queryMyBlog(Integer current);

    /**
     * 查询热门探店笔记
     * @Author israein
     * @date 20:41 2023/5/31
     * @param current
     * @return com.dzdp.dto.Result
     **/
    Result queryHotBlog(Integer current);

    /**
     * 查询点赞列表
     * @Author israein
     * @date 19:55 2023/6/1
     * @param id
     * @return com.dzdp.dto.Result
     **/
    Result queryBlogLikes(Long id);

    /**
     * 分页查询收邮箱
     * @Author israein
     * @date 16:56 2023/6/4
     * @param max
     * @param offset
     * @return com.dzdp.dto.Result
     **/
    Result queryBlogOfFollow(Long max, Integer offset);
}
