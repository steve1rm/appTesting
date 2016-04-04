package com.example.android.testing.androidjunitrunnersample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.fail;

import static org.mockito.Mockito.when;

/**
 * Created by steve on 4/2/16.
 */

@RunWith(MockitoJUnitRunner.class)
public class CalculatorPresenterTest {

    private CalculatorPresenter mCalculatorPresenter;

    @Mock
    private CalculatorActivity mCalculatorActivity;

    @Before
    public void setUp() throws Exception {
        mCalculatorPresenter = new CalculatorPresenter(mCalculatorActivity);
    }

    @After
    public void tearDown() throws Exception {
        mCalculatorPresenter = null;
    }

    @Test
    public void testAdd() throws Exception {
      //  when(mCalculatorPresenter.add(10.0, 10.0)).thenReturn(20.0);
      //  when(mCalculatorPresenter.add(10.0, 20.0))

    }

    @Test
    public void testSub() throws Exception {
        fail("testSub");
    }

    @Test
    public void testDiv() throws Exception {
        fail("testDiv");
    }

    @Test
    public void testMul() throws Exception {
        fail("testMul");
    }
}