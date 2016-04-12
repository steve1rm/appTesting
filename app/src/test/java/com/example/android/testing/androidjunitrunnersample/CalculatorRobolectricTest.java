package com.example.android.testing.androidjunitrunnersample;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
/**
 * Created by steve on 4/12/16.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class CalculatorRobolectricTest {
    private CalculatorActivity mCalculatorActivity;
    private Button mBtnAdd;
    private Button mBtnMul;
    private Button mBtnSub;
    private Button mBtnDiv;
    private EditText mEtFirstNumber;
    private EditText mEtSecondNumber;
    private TextView mTvResult;

    @Before
    public void setUp() throws Exception {
        mCalculatorActivity = Robolectric.setupActivity(CalculatorActivity.class);

        mEtFirstNumber = (EditText)mCalculatorActivity.findViewById(R.id.operand_one_edit_text);
        mEtSecondNumber = (EditText)mCalculatorActivity.findViewById(R.id.operand_two_edit_text);
        mBtnAdd = (Button)mCalculatorActivity.findViewById(R.id.operation_add_btn);
        mBtnMul = (Button)mCalculatorActivity.findViewById(R.id.operation_mul_btn);
        mBtnDiv = (Button)mCalculatorActivity.findViewById(R.id.operation_div_btn);
        mBtnSub = (Button)mCalculatorActivity.findViewById(R.id.operation_sub_btn);

        mTvResult = (TextView)mCalculatorActivity.findViewById(R.id.operation_result_text_view);
    }

    @After
    public void tearDown() throws Exception {
        mCalculatorActivity = null;
    }

    @Test
    public void testAdd() throws Exception {
        mEtFirstNumber.setText("20");
        mEtSecondNumber.setText("4");

        mBtnAdd.performClick();
        assertThat("Can add numbers together", mTvResult.getText().toString(), is("24.0"));
    }

    @Test
    public void testSub() throws Exception {
        mEtFirstNumber.setText("12");
        mEtSecondNumber.setText("4");

        mBtnSub.performClick();
        assertThat("Can subtract numbers together", mTvResult.getText().toString(), is("8.0"));
    }

    @Test
    public void testDiv() throws Exception {
        mEtFirstNumber.setText("24");
        mEtSecondNumber.setText("6");

        mBtnDiv.performClick();
        assertThat("Can divide numbers together", mTvResult.getText().toString(), is("4.0"));
    }

    @Test
    public void testMul() throws Exception {
        mEtFirstNumber.setText("10");
        mEtSecondNumber.setText("4");

        mBtnMul.performClick();
        assertThat("Can multiple numbers together", mTvResult.getText().toString(), is("40.0"));

    }
}