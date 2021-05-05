package com.streamliners.sendobjects;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewStructure;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.streamliners.sendobjects.databinding.ActivityObjectViewerBinding;
import com.streamliners.sendobjects.models.StuDetails;

public class ObjectViewerActivity extends AppCompatActivity {
    ActivityObjectViewerBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b=ActivityObjectViewerBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        // set the title of the activity
        setTitle("View Details");
        // get the data through the intents
        getData();
    }


    private void getData(){
        StuDetails student = getIntent().getExtras().getParcelable(Constants.STUDENT_KEY);
        if(student==null){
            Toast.makeText(this, "No data received!", Toast.LENGTH_SHORT).show();
            return;
        }
        // showing data in the text feild
        b.showNameTextField.getEditText().setText(student.getName());
        b.showRollNumberTextField.getEditText().setText(student.getRollNumber());
        b.showMobileNumberTextField.getEditText().setText(student.getMobileNumber());
        b.showGenderTextField.getEditText().setText(student.getGender());

    }


}