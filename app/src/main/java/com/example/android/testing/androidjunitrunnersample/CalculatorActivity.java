/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.testing.androidjunitrunnersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * {@link android.app.Activity} which contains a simple calculator. Numbers can be entered in the
 * two {@link EditText} fields and result can be obtained by pressing one of the
 * operation {@link Button}s at the bottom.
 */
public class CalculatorActivity extends AppCompatActivity implements CalculatorContract {
    private CalculatorPresenter mCalculatorPresenter;

    @Bind(R.id.operand_one_edit_text) EditText mOperandOneEditText;
    @Bind(R.id.operand_two_edit_text) EditText mOperandTwoEditText;
    @Bind(R.id.operation_result_text_view) TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        ButterKnife.bind(CalculatorActivity.this);

        mCalculatorPresenter = new CalculatorPresenter(CalculatorActivity.this);
    }

    /**
     * OnClick method that is called when the add {@link Button} is pressed.
     */
    @SuppressWarnings("unused")
    @OnClick(R.id.operation_add_btn)
    public void onAdd(View view) {

/*
        mCalculatorPresenter.add(
                Double.valueOf(mOperandOneEditText.getText().toString()),
                Double.valueOf(mOperandTwoEditText.getText().toString()));
*/
    }

    /**
     * OnClick method that is called when the substract {@link Button} is pressed.
     */
    @SuppressWarnings("unused")
    @OnClick(R.id.operation_sub_btn)
    public void onSub(View view) {
        mCalculatorPresenter.sub();
    }

    /**
     * OnClick method that is called when the divide {@link Button} is pressed.
     */
    @SuppressWarnings("unused")
    @OnClick(R.id.operation_div_btn)
    public void onDiv(View view) {
        mCalculatorPresenter.div();
    }

    /**
     * OnClick method that is called when the multiply {@link Button} is pressed.
     */
    @SuppressWarnings("unused")
    @OnClick(R.id.operation_mul_btn)
    public void onMul(View view) {
        mCalculatorPresenter.mul();
    }

    @Override
    public String getFirstDigit() {
        return mOperandOneEditText.getText().toString();
    }

    @Override
    public String getSecondDigit() {
        return mOperandTwoEditText.getText().toString();
    }

    @Override
    public void updateAnswer(Double answer) {
        mResultTextView.setText(String.valueOf(answer));
    }

    @Override
    public void displayError() {
        Toast.makeText(CalculatorActivity.this, "Numbers are not all entered", Toast.LENGTH_SHORT).show();
    }
}
