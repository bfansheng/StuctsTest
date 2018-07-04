package com.bfs;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author lwb
 * @date 2018-7-4
 */
public class HelloWorldAction extends ActionSupport {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // all struts logic here
    public String execute() {

        return SUCCESS;

    }

}
