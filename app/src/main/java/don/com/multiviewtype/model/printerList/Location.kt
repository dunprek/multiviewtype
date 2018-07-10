package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.SerializedName

data class Location(

	@field:SerializedName("village_id")
	val villageId: Int? = null,

	@field:SerializedName("merchant_phone_number")
	val merchantPhoneNumber: String? = null,

	@field:SerializedName("city")
	val city: City? = null,

	@field:SerializedName("merchant_logo_url")
	val merchantLogoUrl: String? = null,

	@field:SerializedName("latitude")
	val latitude: Double = 0.0,

	@field:SerializedName("merchant_name")
	val merchantName: String,

	@field:SerializedName("merchant_id")
	val merchantId: Int? = null,

	@field:SerializedName("merchant_slug")
	val merchantSlug: String? = null,

	@field:SerializedName("province")
	val province: Province? = null,

	@field:SerializedName("province_id")
	val provinceId: Int? = null,

	@field:SerializedName("district")
	val district: District? = null,

	@field:SerializedName("total_printer")
	val totalPrinter: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("merchant_address")
	val merchantAddress: String? = null,

	@field:SerializedName("district_id")
	val districtId: Int? = null,

	@field:SerializedName("postal_code")
	val postalCode: String? = null,

	@field:SerializedName("village")
	val village: Village? = null,

	@field:SerializedName("country_id")
	val countryId: Int? = null,

	@field:SerializedName("city_id")
	val cityId: Int? = null,

	@field:SerializedName("longitude")
	val longitude: Double = 0.0
)