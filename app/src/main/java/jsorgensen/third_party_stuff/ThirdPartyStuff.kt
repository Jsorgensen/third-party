package jsorgensen.third_party_stuff

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThirdPartyStuff : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_party_stuff)

        val text = findViewById<TextView>(R.id.txtMessage);
        val edit = findViewById<EditText>(R.id.edtMessage);
        val button = findViewById<Button>(R.id.btnMessage);
        button.setOnClickListener {
            text.setText(edit.text);
        }

        val txtFamily = findViewById<TextView>(R.id.txtFamily);

        val gson = GsonExplore();
        txtFamily.setText(gson.myFamily.asString())

        val jsonText = findViewById<TextView>(R.id.txtJson)
        jsonText.setText(gson.json);
    }
}