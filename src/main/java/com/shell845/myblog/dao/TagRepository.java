package com.shell845.myblog.dao;

import com.shell845.myblog.po.Tag;
import com.shell845.myblog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author ych
 * @date 16/4/2020 9:06 PM
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByTagName(String name);

    // enquiry types by passing in number of size
    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
