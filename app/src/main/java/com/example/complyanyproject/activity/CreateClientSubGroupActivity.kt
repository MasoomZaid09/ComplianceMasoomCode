package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.complyanyproject.R

class CreateClientSubGroupActivity : AppCompatActivity() {

    lateinit var back: TextView
    lateinit var saved: ImageView
    lateinit var ClientGroupName: TextView
    lateinit var SubClientGroupName: EditText
    lateinit var tv_ClientGroupName: TextView
    lateinit var tv_ClientSubGroupName: TextView
    lateinit var selectClientGroup: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_client_sub_group)

                back = findViewById(R.id.backClientGroup)
                saved = findViewById(R.id.Saved)
                ClientGroupName = findViewById(R.id.client_group)
                SubClientGroupName = findViewById(R.id.SubClientGroupName)
                tv_ClientGroupName = findViewById(R.id.tv_ClientGroupName)
                tv_ClientSubGroupName = findViewById(R.id.tv_ClientSubGroupName)
                selectClientGroup = findViewById(R.id.selectClientGroup)


                saved.setOnClickListener{

            if (ClientGroupName.text.toString().isEmpty()){
                tv_ClientGroupName.text = "*Select Department"
            }
            else if(SubClientGroupName.text.toString().isEmpty()){
                tv_ClientGroupName.text =""
                tv_ClientSubGroupName.text = "*Please enter Client Sub Group Name"
            }
            else {
                tv_ClientGroupName.text = ""
                tv_ClientSubGroupName.text = ""

                Toast.makeText(this,"successfully Created...", Toast.LENGTH_SHORT).show()
                Intent(this, ClientSubGroupActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }

                back.setOnClickListener{
                    onBackPressed()
            }

                selectClientGroup.setOnClickListener {
            Intent(this, SelectorClientSubGroupActivity::class.java).also {
                startActivity(it)
                finish()
            }

        }
            var receiver_msg: TextView? = null


        receiver_msg = findViewById(R.id.client_group);

        val intent = intent

        val str = intent.getStringExtra("message_key")

        with(receiver_msg) {

            this?.setText(str)
        };
    }

    override fun onBackPressed() {
        finish()
    }

}