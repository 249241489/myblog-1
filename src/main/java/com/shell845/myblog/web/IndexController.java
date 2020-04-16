package com.shell845.myblog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ych
 * @date 14/4/2020 9:56 PM
 */

@Controller
public class IndexController {
//    @GetMapping("/{id}/{name}")
    public String index() {
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("Oops the post is gone...");
//        }
        System.out.println("----index-----");
        return "index";
    }

}
