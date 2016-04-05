package com.example.android.testing.androidjunitrunnersample;

/**
 * Created by steve on 4/1/16.
 */

public class CalculatorPresenter {

    private CalculatorActivity mView;

    public CalculatorPresenter(CalculatorActivity view) {
        mView = view;
    }

    /**
     * Addition
     */
    public void addExt() {
        final Double firstDigit = Double.valueOf(mView.getFirstDigit());
        final Double secondDigit = Double.valueOf(mView.getSecondDigit());

        Double answer = firstDigit + secondDigit;

        mView.updateAnswer(answer);
    }

    /**
     * Addition operation
     */
    public void add() {
        final Double firstDigit = Double.valueOf(mView.getFirstDigit());
        final Double secondDigit = Double.valueOf(mView.getSecondDigit());

        mView.updateAnswer(firstDigit + secondDigit);
    }

    /**
     * Substract operation
     */
    public void sub() {
        final Double firstDigit = Double.valueOf(mView.getFirstDigit());
        final Double secondDigit = Double.valueOf(mView.getSecondDigit());

        mView.updateAnswer(firstDigit - secondDigit);
    }

    /**
     * Divide operation
     */
    public void div() {
        final Double firstDigit = Double.valueOf(mView.getFirstDigit());
        final Double secondDigit = Double.valueOf(mView.getSecondDigit());

        if(secondDigit != 0) {
            mView.updateAnswer(firstDigit / secondDigit);
        }
        else {
            mView.updateAnswer(0.0);
        }
    }

    /**
     * Multiply operation
     */
    public void mul() {
        final Double firstDigit = Double.valueOf(mView.getFirstDigit());
        final Double secondDigit = Double.valueOf(mView.getSecondDigit());

        mView.updateAnswer(firstDigit * secondDigit);
    }
}
