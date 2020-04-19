package com.shell845.myblog.dao;

import com.shell845.myblog.po.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ych
 * @date 17/4/2020 5:45 PM
 */

@Service
public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {

    // enquiry types by passing in number of size
    @Query("select b from Blog b where b.isRecommend = true")
    List<Blog> findTop(Pageable pageable);

    // enquiry for search
    @Query("select b from Blog b where b.title like ?1 or b.description like ?1")
    Page<Blog> findByQuery(String query, Pageable pageable);

}
