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
        Double firstOperand = Double.valueOf(mView.mOperandOneEditText.getText().toString());
        Double secondOperand = Double.valueOf(mView.mOperandTwoEditText.getText().toString());

        Double answer = firstOperand + secondOperand;
        mView.updateAnswer(answer);
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
        if(secondOperand != 0) {
            mView.updateAnswer(firstOperand / secondOperand);
        }
        else {
            mView.updateAnswer(0.0);
        }
    }

    /**
     * Multiply operation
     */
    public void mul(Double firstOperand, Double secondOperand) {
        mView.updateAnswer(firstOperand * secondOperand);
    }
}
