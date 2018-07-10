package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.SerializedName

data class Province(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("country_id")
	val countryId: Int? = null
)