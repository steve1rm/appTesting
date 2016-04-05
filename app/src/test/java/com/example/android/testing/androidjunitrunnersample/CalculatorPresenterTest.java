package com.example.android.testing.androidjunitrunnersample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import static org.mockito.Mockito.verify;
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
    public void failIfFirstDigitsIsEmpty() throws Exception {
        when(mCalculatorActivity.getFirstDigit()).thenReturn("");
        mCalculatorPresenter.add();

        verify(mCalculatorActivity).displayError();
    }

    @Test
    public void testAddExt() throws Exception {
        final Double num1 = Double.valueOf(mCalculatorActivity.mOperandOneEditText.getText().toString());
        final Double num2 = Double.valueOf(mCalculatorActivity.mOperandTwoEditText.getText().toString());

    //    mCalculatorPresenter.add(num1, num2);


    }

    @Test
    public void testAdd() throws Exception {

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