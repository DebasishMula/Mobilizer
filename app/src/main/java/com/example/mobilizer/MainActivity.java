package com.example.mobilizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView questionNo,companyName,contactPerson,contactNo,emailId,slNo,projectName,unlockType,requesterName,requestTo,requesterContactNo,invoiceNo,invoiceDate;
    private Spinner branch;
    private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionNo=findViewById(R.id.CURequestQNNo);
        companyName=findViewById(R.id.CURequestCoN);
        contactPerson=findViewById(R.id.CURequestCP);
        contactNo=findViewById(R.id.CURequestCN);
        emailId=findViewById(R.id.CURequestEmailId);
        slNo=findViewById(R.id.CURequestSN);
        projectName=findViewById(R.id.CURequestPN);
        unlockType=findViewById(R.id.CURequestUT);
        requesterName=findViewById(R.id.CURequestRN);
        requestTo=findViewById(R.id.CURequestURT);
        requesterContactNo=findViewById(R.id.CURequestRCN);
        invoiceNo=findViewById(R.id.CURequestIN);
        invoiceDate=findViewById(R.id.CURequestID);
        branch=findViewById(R.id.CURequest_branch_spinner);
        save=findViewById(R.id.CURequestSave);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }

}