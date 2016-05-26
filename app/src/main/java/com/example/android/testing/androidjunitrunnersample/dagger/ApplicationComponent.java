package com.example.android.testing.androidjunitrunnersample.dagger;

import com.example.android.testing.androidjunitrunnersample.CalculatorActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by steve on 5/26/16.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(CalculatorActivity target);
    void inject(MainApplicationClass target);
}
