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
     * Addition operation
     */
    public void add(Double firstOperand, Double secondOperand) {
        mView.updateAnswer(firstOperand + secondOperand);
    }

    /**
     * Substract operation
     */
    public void sub(Double firstOperand, Double secondOperand) {
        mView.updateAnswer(firstOperand - secondOperand);
    }

    /**
     * Divide operation
     */
    public void div(Double firstOperand, Double secondOperand) {
        // checkArgument(secondOperand != 0, "secondOperand must be != 0, you cannot divide by zero");
        mView.updateAnswer(firstOperand / secondOperand);
    }

    /**
     * Multiply operation
     */
    public void mul(Double firstOperand, Double secondOperand) {
        mView.updateAnswer(firstOperand * secondOperand);
    }
}
