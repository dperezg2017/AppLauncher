package com.ryan.github.launcher.sample;

import android.util.Log;

import com.ryan.github.launcher.task.LauncherTask;
import com.ryan.github.launcher.task.ILauncherTask;

import java.util.ArrayList;
import java.util.List;

import static com.ryan.github.launcher.sample.Constants.TAG;

/**
 * Created by Ryan
 * at 2019/7/1
 */
public class SimpleLauncherTask6 extends LauncherTask {

    @Override
    public List<Class<? extends ILauncherTask>> dependsOn() {
        List<Class<? extends ILauncherTask>> dependsOn = new ArrayList<>();
        dependsOn.add(SimpleLauncherTask7.class);
        dependsOn.add(SimpleLauncherTask1.class);
        dependsOn.add(SimpleLauncherTask4.class);
        return dependsOn;
    }

    @Override
    protected void call() {
        randomSleepTest();
        Log.v(TAG, "SimpleLauncherTask6 execute run...depends on " + getDependsOnString());
    }

    @Override
    public boolean mustFinishBeforeBreakPoint() {
        return true;
    }
}