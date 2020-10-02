package com.dicoding.picodiploma.myprojectkp.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView
import com.dicoding.picodiploma.myprojectkp.R
import com.dicoding.picodiploma.myprojectkp.data.TableClass
import kotlinx.android.synthetic.main.list_history.view.*

class TableAdapter(context: Context, data: ArrayList<TableClass>) : ArrayAdapter<TableClass>(context, -1, data) {
    private val mContext: Context
    private val dataSet: ArrayList<TableClass>
    private val headerColor = Color.parseColor("#0062cc")

    init {
        mContext = context
        dataSet = data
    }

    class ViewHolder(row : View?) {
        var layout : LinearLayout? = null
        var txtTanggal : TextView? = null
        var txtJamMasuk : TextView? = null
        var txtJamPulang : TextView? = null
        var txtStatus : TextView? = null
        var txtWaktuKerja: TextView? = null

        init {
            layout = row?.findViewById(R.id.listLayout) as LinearLayout
            txtTanggal = row?.findViewById(R.id.txtTanggal) as TextView
            txtJamMasuk = row?.findViewById(R.id.txtJamMasuk) as TextView
            txtJamPulang = row?.findViewById(R.id.txtJamPulang) as TextView
            txtStatus = row?.findViewById(R.id.txtstatus) as TextView
            txtWaktuKerja = row?.findViewById(R.id.txtWaktuKerja) as TextView
        }
    }

    override fun getViewTypeCount(): Int {
        return super.getCount()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    private var lastPosition = -1
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val model: TableClass? = getItem(position)
        val viewHolder: ViewHolder
        val view: View

        if (convertView == null) {
            val inflater =
                mContext?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.list_history, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
            viewHolder.txtTanggal?.text = ""
            viewHolder.txtJamMasuk?.text = ""
            viewHolder.txtJamPulang?.text = ""
            viewHolder.txtStatus?.text = ""
            viewHolder.txtWaktuKerja?.text = ""
        }
        lastPosition = position

        if (model?.headerTanggal != null && model?.headerJamMasuk != null && model?.headerJamPulang !=null && model?.headerStatus != null && model?.headerWaktuKerja !=null) {
            viewHolder.txtTanggal?.text = model?.headerTanggal.toString()
            viewHolder.txtJamMasuk?.text = model?.headerJamMasuk.toString()
            viewHolder.txtJamPulang?.text = model?.headerJamPulang.toString()
            viewHolder.txtStatus?.text = model?.headerStatus.toString()
            viewHolder.txtWaktuKerja?.text = model?.headerWaktuKerja.toString()
            viewHolder.layout?.setBackgroundColor(headerColor)
            viewHolder.txtTanggal?.setTypeface(null, Typeface.BOLD)
            viewHolder.txtJamMasuk?.setTypeface(null, Typeface.BOLD)
            viewHolder.txtJamPulang?.setTypeface(null, Typeface.BOLD)
            viewHolder.txtStatus?.setTypeface(null, Typeface.BOLD)
            viewHolder.txtWaktuKerja?.setTypeface(null, Typeface.BOLD)
            viewHolder.txtTanggal?.setTextColor(Color.WHITE)
            viewHolder.txtJamMasuk?.setTextColor(Color.WHITE)
            viewHolder.txtJamPulang?.setTextColor(Color.WHITE)
            viewHolder.txtStatus?.setTextColor(Color.WHITE)
            viewHolder.txtWaktuKerja?.setTextColor(Color.WHITE)
        } else {
            viewHolder.txtTanggal?.text = model?.tanggal.toString()
            viewHolder.txtJamMasuk?.text = model?.jamMasuk
            viewHolder.txtJamPulang?.text = model?.jamPulang
            viewHolder.txtStatus?.text = model?.status
            viewHolder.txtWaktuKerja?.text = model?.waktuKerja
            viewHolder.layout?.setBackgroundColor(Color.WHITE)
            viewHolder.txtTanggal?.setTypeface(null, Typeface.NORMAL)
            viewHolder.txtJamMasuk?.setTypeface(null, Typeface.NORMAL)
            viewHolder.txtJamPulang?.setTypeface(null, Typeface.NORMAL)
            viewHolder.txtStatus?.setTypeface(null, Typeface.NORMAL)
            viewHolder.txtWaktuKerja?.setTypeface(null, Typeface.NORMAL)
            viewHolder.txtTanggal?.setTextColor(Color.BLACK)
            viewHolder.txtJamMasuk?.setTextColor(Color.BLACK)
            viewHolder.txtJamPulang?.setTextColor(Color.BLACK)
            viewHolder.txtStatus?.setTextColor(Color.BLACK)
            viewHolder.txtWaktuKerja?.setTextColor(Color.BLACK)
        }

        return view as View
    }
}