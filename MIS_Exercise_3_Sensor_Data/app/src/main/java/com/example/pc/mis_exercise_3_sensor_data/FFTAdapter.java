package com.example.pc.mis_exercise_3_sensor_data;

import com.robinhood.spark.SparkAdapter;

/**
 * Created by matpa on 5/18/2016.
 * SparkView for showing chart uses this class
 */
public class FFTAdapter extends SparkAdapter {
    private double[] yData;

    public FFTAdapter(double[] yData) {
        this.yData = yData;
    }

    @Override
    public int getCount() {
        return yData.length;
    }

    @Override
    public Object getItem(int index) {
        return yData[index];
    }

    @Override
    public float getY(int index) {
        return ((float) yData[index]);
    }
}