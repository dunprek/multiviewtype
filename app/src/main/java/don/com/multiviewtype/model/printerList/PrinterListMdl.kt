package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.SerializedName

data class PrinterListResponseMdl(

        @field:SerializedName("data")
        val data: List<DataItem?>? = null,

        @field:SerializedName("meta")
        val meta: Meta? = null
)


