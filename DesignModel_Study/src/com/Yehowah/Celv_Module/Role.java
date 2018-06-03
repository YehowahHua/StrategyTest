package com.Yehowah.Celv_Module;

/**
 * 游戏的角色超类
 */
public abstract class Role {
    protected String name;
    protected abstract void display();
    protected abstract void run();
    protected abstract void attack();//攻击
    protected abstract void defend();//防御
}
