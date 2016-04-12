package com.example.android.testing.androidjunitrunnersample;

/**
 * Created by steve on 4/1/16.
 */

public class CalculatorPresenter {

    private CalculatorActivity mView;
    private CalculatorModel mCalculatorModel;

    public CalculatorPresenter(CalculatorActivity view) {
        mView = view;
        mCalculatorModel = new CalculatorModel();
    }

    /**
     * Addition operation
     */
    public void add() {
        final Double firstDigit = Double.valueOf(mView.getFirstDigit());
        final Double secondDigit = Double.valueOf(mView.getSecondDigit());

        Double answer = mCalculatorModel.add(firstDigit, secondDigit);
        mView.updateAnswer(answer);
    }

    /**
     * Substract operation
     */
    public void sub() {
        final Double firstDigit = Double.valueOf(mView.getFirstDigit());
        final Double secondDigit = Double.valueOf(mView.getSecondDigit());

        final Double answer = mCalculatorModel.sub(firstDigit, secondDigit);
        mView.updateAnswer(answer);
    }

    /**
     * Divide operation
     */
    public void div() {
        final Double firstDigit = Double.valueOf(mView.getFirstDigit());
        final Double secondDigit = Double.valueOf(mView.getSecondDigit());

        final Double answer = mCalculatorModel.div(firstDigit, secondDigit);
        mView.updateAnswer(answer);
    }

    /**
     * Multiply operation
     */
    public void mul() {
        final Double firstDigit = Double.valueOf(mView.getFirstDigit());
        final Double secondDigit = Double.valueOf(mView.getSecondDigit());

        final Double answer = mCalculatorModel.mul(firstDigit, secondDigit);
        mView.updateAnswer(answer);
    }
}
