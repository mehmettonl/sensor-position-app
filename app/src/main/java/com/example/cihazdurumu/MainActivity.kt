package com.example.cihazdurumu

import android.annotation.SuppressLint
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cihazdurumu.R

class MainActivity : AppCompatActivity(), SensorEventListener {

    private lateinit var sensorManager: SensorManager
    private var accelerometer: Sensor? = null

    private lateinit var positionText: TextView
    private lateinit var valuesText: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        positionText = findViewById(R.id.positionText)
        valuesText = findViewById(R.id.valuesText)

        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        accelerometer?.also {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onSensorChanged(event: SensorEvent) {
        val x = event.values[0]
        val y = event.values[1]
        val z = event.values[2]

        valuesText.text = "X: $x\nY: $y\nZ: $z"

        val position = when {
            z > 9 -> "Ekran yukarıda (masaya ekran üstü koyulmuş)"
            z < -9 -> "Kamera yukarıda (masaya kamera üstü koyulmuş)"
            y > 9 -> "Dikey konum (alt taraf aşağıda)"
            y < -9 -> "Dikey konum (üst taraf aşağıda)"
            x > 9 -> "Yatay konum (sol taraf yukarıda)"
            x < -9 -> "Yatay konum (sağ taraf yukarıda)"
            else -> "Ara konumda"
        }

        positionText.text = "Pozisyon: $position"
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}

    override fun onDestroy() {
        super.onDestroy()
        sensorManager.unregisterListener(this)
    }
}