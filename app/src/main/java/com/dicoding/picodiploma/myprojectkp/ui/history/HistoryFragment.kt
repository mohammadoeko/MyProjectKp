package com.dicoding.picodiploma.myprojectkp.ui.history

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dicoding.picodiploma.myprojectkp.R
import com.dicoding.picodiploma.myprojectkp.adapter.TableAdapter
import com.dicoding.picodiploma.myprojectkp.data.TableClass
import com.google.gson.internal.bind.ArrayTypeAdapter
import kotlinx.android.synthetic.main.fragment_history.*
import java.util.*
import kotlin.collections.ArrayList

class HistoryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_history, container, false)
        return root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val history = TableClass(requireActivity())
        val data = ArrayList<TableClass>()
        data.add(history.addHeader("Tanggal", "Jam Masuk", "Jam Pulang", "Status", "Waktu Kerja"))
        data.add(history.addData(1, "09.20.30", "12.30.50", "HADIR", "3 jam 10.20 menit"))
        data.add(history.addData(2, "08.20.30", "13.30.60", "HADIR", "5 jam 10.30 menit"))
        data.add(history.addData(3, "13.20.20", "15.40.10", "HADIR", "2 jam 19.50 menit"))

        TableAdapter(requireActivity(), data).also { adapter -> rv_history.adapter = adapter }

    }

    @SuppressLint("SetTextI18n")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val month = resources.getStringArray(R.array.Month)
        val years = resources.getStringArray(R.array.Years)

        val spinner_month = requireActivity().findViewById<Spinner>(R.id.spinner_month)
        val spinner_years = requireActivity().findViewById<Spinner>(R.id.spinner_years)

        if (spinner_month != null) {
            val adapter_month = ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_item, month)
            spinner_month.adapter = adapter_month
        }

            if (spinner_years != null) {
                val adapter_years = ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_item, years)
                spinner_years.adapter = adapter_years
            }
        }
    }





