package com.example.complyanyproject.MenuFragments

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.OverDueActivity
import java.util.*

class PostsFragment : Fragment() {

    lateinit var FromdateTextView: TextView
    lateinit var TodateTextView: TextView

    lateinit var FromdateImageView: ImageView
    lateinit var TodateImageView: ImageView

    lateinit var overDueLayout: RelativeLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_posts, container, false)
        overDueLayout = view.findViewById(R.id.OverDueLayout)

        overDueLayout.setOnClickListener {
//            Toast.makeText(context,"overdue",Toast.LENGTH_SHORT).show()
            var intent = Intent(context, OverDueActivity::class.java)
            startActivity(intent)
        }



        FromdateTextView = view.findViewById(R.id.from_date_Text)
        TodateTextView = view.findViewById(R.id.to_date_Text)

        FromdateImageView = view.findViewById(R.id.from_date_ImageView)
        TodateImageView = view.findViewById(R.id.to_date_ImageView)


        val calendar: Calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)

        FromdateTextView.text = "$date-${month + 1}-$year"

        TodateTextView.text = "$date-${month + 1}-$year"

        FromdateImageView.setOnClickListener {

            val datePickerDialog = activity?.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        FromdateTextView.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }

        TodateImageView.setOnClickListener {

            val datePickerDialog = activity?.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        TodateTextView.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }

        return view
    }


}