package com.Yehowah.Celv_Module;

/**
 * Created by VULCAN on 2018/6/3.
 */
public class RoleB extends Role{
    public RoleB (String name){
        this.name = name;
    }

    @Override
    protected void display() {
        System.out.println("英俊潇洒");
    }

    @Override
    protected void run() {
        System.out.println("金蝉出窍");//从roleA中copy
    }

    @Override
    protected void attack() {
        System.out.println("降龙十八掌");
    }

    @Override
    protected void defend() {
        System.out.println("铁布衫");
    }
}
