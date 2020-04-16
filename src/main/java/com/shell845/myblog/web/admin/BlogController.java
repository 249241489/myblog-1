package com.shell845.myblog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ych
 * @date 16/4/2020 6:58 PM
 */

@Controller
@RequestMapping("admin")
public class BlogController {
    @GetMapping("/blogs")
    public String blogs() {
        return "admin/blogs";
    }
}
