package mo.atef.amit.daythree.daythree.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.ActivityDateTimePickerBinding;

public class DateTimePickerActivity extends AppCompatActivity {

    ActivityDateTimePickerBinding binding;
    private int mYear;
    private int mMonth;
    private int mDay;
    private int mHour;
    private int mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_picker);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_date_time_picker);

        binding.imgDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                mYear=calendar.get(Calendar.YEAR);
                mMonth=calendar.get(Calendar.MONTH);
                mDay =calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog=new DatePickerDialog(DateTimePickerActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                                Log.e("selectedValue", dayOfMonth+"-"+(monthOfYear+1)+"-"+year);
                                Log.d("selectedValue", dayOfMonth+"-"+(monthOfYear+1)+"-"+year);
                                binding.tvDepartringValue.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);
                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });


        binding.imgTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                mHour = calendar.get(Calendar.HOUR_OF_DAY);
                mMinute = calendar.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog= new TimePickerDialog(DateTimePickerActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                                Log.e("selectedValue", hour+":"+minute);
                                Log.d("selectedValue", hour+":"+minute);
                                binding.tvReturningValue.setText(hour+":"+minute);
                            }
                        },mHour, mMinute,false );
                timePickerDialog.show();
            }
        });
    }
}