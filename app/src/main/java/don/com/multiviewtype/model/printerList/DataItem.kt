package com.ag.printerqoe.model.printerList

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DataItem(@field:SerializedName("type") @field:Expose val type: String = "" ) {

    @field:SerializedName("color_price")
    val colorPrice: Int = 0

    @field:SerializedName("printer_category_id")
    val printerCategoryId: Int = 0

    @field:SerializedName("printer_brand_id")
    val printerBrandId: Int = 0

    @field:SerializedName("quantity")
    val quantity: Int = 0

    @field:SerializedName("is_active")
    val isActive: Boolean = false

    @field:SerializedName("printer_type_id")
    val printerTypeId: Int = 0

    @field:SerializedName("image_url")
    val imageUrl: String = ""

    @field:SerializedName("description")
    val description: String? = null

    @field:SerializedName("merchant")
    val merchant: Merchant? = null

    @field:SerializedName("bw_price")
    val bwPrice: Int? = null

    @field:SerializedName("merchant_id")
    val merchantId: Int=0

    @field:SerializedName("colors")
    val colors: List<String?>? = null

    @field:SerializedName("name")
    val name: String=""

    @field:SerializedName("id")
    val id: Int=0

    @field:SerializedName("slug")
    val slug: String? = null
}



