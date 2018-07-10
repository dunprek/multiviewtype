package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.SerializedName

data class Meta(

	@field:SerializedName("pagination")
	val pagination: Pagination? = null,

	@field:SerializedName("total_printer")
	val totalPrinter: Int? = null
)