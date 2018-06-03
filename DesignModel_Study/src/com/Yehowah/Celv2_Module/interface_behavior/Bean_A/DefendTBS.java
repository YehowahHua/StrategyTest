package com.Yehowah.Celv2_Module.interface_behavior.Bean_A;

import com.Yehowah.Celv2_Module.interface_behavior.IDefendBehavior;

/**
 * Created by VULCAN on 2018/6/3.
 */
public class DefendTBS implements IDefendBehavior {
    @Override
    public void defend() {
        System.out.println("铁布衫");
    }
}
