package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.SerializedName

data class District(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("city_id")
	val cityId: Int? = null
)