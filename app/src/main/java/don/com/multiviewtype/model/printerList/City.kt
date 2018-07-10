package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.SerializedName

data class City(

	@field:SerializedName("province_id")
	val provinceId: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)