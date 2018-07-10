package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.SerializedName

data class Merchant(

	@field:SerializedName("address")
	val address: String,

	@field:SerializedName("company_id")
	val companyId: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("phone_number")
	val phoneNumber: String,

	@field:SerializedName("location")
	val location: Location,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("email")
	val email: String? = null
)