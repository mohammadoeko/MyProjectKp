package com.dicoding.picodiploma.myprojectkp.data

import android.content.Context
import com.dicoding.picodiploma.myprojectkp.ui.history.HistoryFragment

class TableClass(context: Context?) {

    val mContext: Context? = context

    var tanggal: Int? = 1
    var jamMasuk: String? = null
    var jamPulang: String? = null
    var status: String? = null
    var waktuKerja: String? = null

    var headerTanggal: String? = null
    var headerJamMasuk: String? = null
    var headerJamPulang: String? = null
    var headerStatus: String? = null
    var headerWaktuKerja: String? = null

    fun addHeader(headerTanggal: String, headerJamMasuk: String, headerJamPulang: String, headerStatus: String, headerWaktuKerja: String): TableClass {
        val data = TableClass(mContext)
        data.headerTanggal = headerTanggal
        data.headerJamMasuk = headerJamMasuk
        data.headerJamPulang = headerJamPulang
        data.headerStatus = headerStatus
        data.headerWaktuKerja = headerWaktuKerja
        return data
    }

    fun addData(tanggal: Int, jamMasuk: String, jamPulang: String, status: String, waktuKerja: String): TableClass {
        val data = TableClass(mContext)
        data.tanggal = tanggal
        data.jamMasuk = jamMasuk
        data.jamPulang = jamPulang
        data.status = status
        data.waktuKerja = waktuKerja
        return data
    }
}