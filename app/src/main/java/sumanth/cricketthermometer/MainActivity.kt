package sumanth.cricketthermometer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    val formatter : DecimalFormat = DecimalFormat("#0.00")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalc.setOnClickListener {
            if(etChirps.text.isBlank()){
                Toast.makeText(this,"field is empty",Toast.LENGTH_SHORT).show()
            }else{
                val chirps : Int = etChirps.text.toString().toInt()
                val temp : Double = (chirps/3.0)+4
                val result = "The approximate temperature outside is ${formatter.format(temp)} degree Celsius"
                tvResult.setText(result)
            }
        }


    }
}