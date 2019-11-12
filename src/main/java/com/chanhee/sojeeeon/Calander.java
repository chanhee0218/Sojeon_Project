package com.chanhee.sojeeeon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import static java.util.Calendar.SUNDAY;

public class Calander extends AppCompatActivity {
    private  final  OneDayDecorator oneDayDecorator= new OneDayDecorator();
   MaterialCalendarView materialCalendarView;
   Intent intent=new Intent(this,Todo.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calander);
        findViewById(R.id.calanderview);
        materialCalendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {

                if(selected){
                    startActivity(intent);
                }
            }
        });

        materialCalendarView.state().edit()
                .setFirstDayOfWeek(SUNDAY)
                .setMinimumDate(CalendarDay.from(2019,0,1))
                .setMaximumDate(CalendarDay.from(2022,10,31))
                .setCalendarDisplayMode(CalendarMode.MONTHS)
                .commit();




    }
}
