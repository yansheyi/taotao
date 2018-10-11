package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 */
@Controller
public class PageController {

    /**
     * 返回一个首页
     */
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    /**
     * 显示其他页面
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(String page){
        return page;
    }

}
