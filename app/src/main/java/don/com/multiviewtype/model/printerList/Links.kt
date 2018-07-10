package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.SerializedName

data class Links(

	@field:SerializedName("next")
	val next: String? = null,

	@field:SerializedName("previous")
	val previous: String? = null
)