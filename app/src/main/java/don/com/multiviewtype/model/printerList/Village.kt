package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.SerializedName

data class Village(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("district_id")
	val districtId: Int? = null
)