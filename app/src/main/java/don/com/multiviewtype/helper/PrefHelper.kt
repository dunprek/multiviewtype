package don.com.multiviewtype.helper

import android.content.Context
import android.content.SharedPreferences
import android.content.Context.MODE_PRIVATE


/**
 * Created by GideonST on 4/10/2018.
 */
class PrefHelper {


    companion object {
        lateinit var sharedPreferences: SharedPreferences

        private val PREF_NAME = "PRINTER_QOE_PREF"

        private val PREF_OBJECT_MERCHANT = "MERCHANT_OBJECT"
        private val PREF_USER_TOKEN = "USER_TOKEN"
        private val PREF_IS_LOGIN = "USER_IS_LOGIN"
        private val PREF_OBJECT_DATA = "USER_DATA"
        private val PREF_BW_PRICE = "PRINTER_BW_PRICE"
        private val PREF_COLOR_PRICE = "PRINTER_COLOR_PRICE"
        private val PREF_FIRST_TIME = "FIRST_TIME"
        private val PREF_DOC_NAME = "ORDER_DOC_NAME"
        private val PREF_DOC_TOTAL_PAGE = "ORDER_DOC_PAGE"
        private val PREF_DOC_PDF_PAGE = "ORDER_DOC_PDF_PAGE"
        private val PREF_DOC_COPY = "ORDER_DOC_COPY"
        private val PREF_DOC_COLOR = "ORDER_DOC_COLOR"
        private val PREF_DOC_SIZE = "ORDER_DOC_SIZE"
        private val PREF_DOC_NOTES = "ORDER_DOC_NOTES"
        private val PREF_DOC_TOTAL_PRICE = "ODER_DOC_TOTAL_PRICE"
        private val PREF_DOC_NAME_ORIGINAL = "DOCUMENT_FILE_NAME"
        private val PREF_DOC_ORDER_ID = "ORDER_ID"
        private val PREF_PAPER_SPEC_ID = "PAPER_SPEC_ID"
        private val PREF_DOC_PATH = "DOCUMENT_FILE_PATH"
        private val PREF_PRINTERQOE_FAQ = "PRINTERQOE_FAQ"

        private val PREF_PRINTERLIST_GSON = "PRINTERLIST_GSON"


        private val PREF_PRINTER_ID = "PRINTER_ID"
        private val PREF_PRINTER_NAME = "PRINTER_NAME"
        private val PREF_PRINTER_IMAGE_URL = "PRINTER_IMAGE_URL"

        private val PREF_IS_MERCHANT_ADMIN = "IS_MERCHANT_ADMIN"
        private val PREF_MERCHANT_ID = "MERCHANT_ID"
        private val PREF_MERCHANT_ADMIN_ID = "MERCHANT_ADMIN_ID"
        private val PREF_MERCHANT_NAME = "MERCHANT_NAME"
        private val PREF_MERCHANT_ADDRESS = "MERCHANT_ADDRESS"


        private val PREF_USER_ID = "USER_ID"
        private val PREF_USER_USERNAME = "USER_USERNAME"
        private val PREF_USER_EMAIL = "USER_EMAIL"
        private val PREF_USER_FIRST_NAME = "USER_FIRST_NAME"
        private val PREF_USER_LAST_NAME = "USER_LAST_NAME"
        private val PREF_USER_FULL_NAME = "USER_FULL_NAME"
        private val PREF_USER_BIRTH_DATE = "USER_BIRTH_DATE"
        private val PREF_USER_GENDER = "USER_GENDER"
        private val PREF_USER_PHONE_NUMBER = "USER_PHONE_NUMBER"
        private val PREF_USER_ADDRESS = "USER_ADDRESS"
        private val PREF_USER_AVATAR_URL = "USER_AVATAR_URL"
        private val PREF_USER_POSTAL_CODE = "USER_POSTAL_CODE"
        private val PREF_USER_COUNTRY_ID = "USER_COUNTRY_ID"
        private val PREF_USER_PROVINCE_ID = "USER_PROVINCE_ID"
        private val PREF_USER_CITY_ID = "USER_CITY_ID"
        private val PREF_USER_DISTRICT_ID = "USER_DISTRICT_ID"
        private val PREF_USER_VILLAGE_ID = "USER_VILLAGE_ID"
        private val PREF_USER_STATUS_ID = "USER_STATUS_ID"
        private val PREF_USER_STATUS = "USER_STATUS"
        private val PREF_USER_SELECTED_COLOR = "USER_SELECTED_COLOR"
        private val PREF_USER_SELECTED_SIZE = "USER_SELECTED_SIZE"
        private val PREF_USER_LINKED_IN_LOGGED = "USER_LINKED_IN_LOGGED"
        private val PREF_USER_FACEBOOK_LOGGED = "USER_FACEBOOK_LOGGED"


        private val PREF_USER_SELECTED_FRAGMENT_ORDER_HISTORY = "USER_SELECTED_FRAGMENT_ORDER_HISTORY"




        //PREF PRINTER NAME
        fun savePrinterListGSON(context: Context, printerName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_PRINTERLIST_GSON, printerName)
                    .apply()
        }

        fun getPrinterListGSON(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_PRINTERLIST_GSON, "")
        }



        //PREF PRINTER ID
        fun savePrinterId(context: Context, printerId: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_PRINTER_ID, printerId)
                    .apply()
        }

        fun getPrinterId(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_PRINTER_ID, 0)
        }


        //PREF PRINTER NAME
        fun savePrinterName(context: Context, printerName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_PRINTER_NAME, printerName)
                    .apply()
        }

        fun getPrinterName(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_PRINTER_NAME, "")
        }


        //PREF PRINTER IMAGE URL
        fun savePrinterImageURL(context: Context, printerImageURL: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_PRINTER_IMAGE_URL, printerImageURL)
                    .apply()
        }

        fun getPrinterImageURL(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_PRINTER_IMAGE_URL, "")
        }


        //PREF MERCHANT ID
        fun saveMerchantID(context: Context, merchantID: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_MERCHANT_ID, merchantID)
                    .apply()
        }

        fun getMerchantID(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_MERCHANT_ID, 0)
        }

        //PREF MERCHANT ADMIN ID
        fun saveMerchantAdminID(context: Context, merchantID: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_MERCHANT_ADMIN_ID, merchantID)
                    .apply()
        }

        fun getMerchantAdminID(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_MERCHANT_ADMIN_ID, 1)
        }


        //PREF MERCHANT NAME
        fun saveMerchantName(context: Context, merchantName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_MERCHANT_NAME, merchantName)
                    .apply()
        }

        fun getMerchantName(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_MERCHANT_NAME, "")
        }


        //PREF MERCHANT ADDRESS
        fun saveMerchantAddress(context: Context, merchantName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_MERCHANT_ADDRESS, merchantName)
                    .apply()
        }

        fun getMerchantAddress(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_MERCHANT_ADDRESS, "")
        }


        fun getIsLogin(context: Context): Boolean {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            return sharedPreferences.getBoolean(PREF_IS_LOGIN, false)
        }

        fun setIsLogin(boolean: Boolean, context: Context) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putBoolean(PREF_IS_LOGIN, boolean)
                    .apply()
        }

        fun getIsFacebookLogin(context: Context): Boolean {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            return sharedPreferences.getBoolean(PREF_USER_FACEBOOK_LOGGED, false)
        }

        fun setIsFacebookLogin(boolean: Boolean, context: Context) {
            val editor = context.getSharedPreferences(PREF_USER_FACEBOOK_LOGGED, MODE_PRIVATE).edit()
            editor.putBoolean(PREF_IS_LOGIN, boolean)
                    .apply()
        }

        fun getIsLinkedInLogin(context: Context): Boolean {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            return sharedPreferences.getBoolean(PREF_USER_LINKED_IN_LOGGED, false)
        }

        fun setIsLinkedInLogin(boolean: Boolean, context: Context) {
            val editor = context.getSharedPreferences(PREF_USER_LINKED_IN_LOGGED, MODE_PRIVATE).edit()
            editor.putBoolean(PREF_IS_LOGIN, boolean)
                    .apply()
        }


        fun getIsMerchantAdmin(context: Context): Boolean {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            return sharedPreferences.getBoolean(PREF_IS_MERCHANT_ADMIN, false)
        }

        fun setIsMerchantAdmin(boolean: Boolean, context: Context) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putBoolean(PREF_IS_MERCHANT_ADMIN, boolean)
                    .apply()
        }

        fun getFirstTime(context: Context): Boolean {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            return sharedPreferences.getBoolean(PREF_FIRST_TIME, true)
        }

        fun setFirstTime(boolean: Boolean, context: Context) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putBoolean(PREF_FIRST_TIME, boolean)
                    .apply()
        }


        fun saveToken(context: Context, token: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_TOKEN, token)
                    .apply()
        }

        fun getToken(context: Context): String? {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_TOKEN, "")
        }

        fun saveMerchantObject(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_OBJECT_MERCHANT, objects)
                    .apply()
        }

        fun getMerchantObject(context: Context): String? {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_OBJECT_MERCHANT, "")
        }

        fun saveDataItem(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_OBJECT_DATA, objects).apply()
        }


        fun getDataItem(context: Context): String? {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_OBJECT_DATA, "")
        }

        fun saveBWPrice(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_BW_PRICE, objects).apply()
        }

        fun getBWPrice(context: Context): String? {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_BW_PRICE, "")
        }

        fun saveColorPrice(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_COLOR_PRICE, objects).apply()
        }

        fun getColorPrice(context: Context): String? {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_COLOR_PRICE, "")
        }


        fun saveDocName(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_DOC_NAME, objects).apply()
        }

        fun getDocName(context: Context): String? {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_DOC_NAME, "")
        }

        fun saveTotalPDFPage(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_DOC_PDF_PAGE, objects).apply()
        }

        fun getTotalPDFPage(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_DOC_PDF_PAGE, "")
        }


        fun saveTotalCopy(context: Context, objects: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_DOC_COPY, objects).apply()
        }

        fun getTotalCopy(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_DOC_COPY, 0)
        }

        fun saveTotalPage(context: Context, objects: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_DOC_TOTAL_PAGE, objects).apply()
        }

        fun getTotalPage(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_DOC_TOTAL_PAGE, 0)
        }


        fun getTotalPrice(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_DOC_TOTAL_PRICE, 0)
        }

        fun saveTotalPrice(context: Context, objects: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_DOC_TOTAL_PRICE, objects).apply()
        }

        fun saveDocColor(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_DOC_COLOR, objects).apply()
        }

        fun getDocColor(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_DOC_COLOR, "")
        }

        fun saveDocSize(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_DOC_SIZE, objects).apply()
        }

        fun getDocSize(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_DOC_SIZE, "")
        }

        fun saveDocNotes(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_DOC_NOTES, objects).apply()
        }

        fun getDocNotes(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_DOC_NOTES, "")
        }


        fun saveFaqObject(context: Context, objects: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_PRINTERQOE_FAQ, objects)
                    .apply()
        }

        fun getFaqObject(context: Context): String? {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_PRINTERQOE_FAQ, "")
        }


        fun savePDFName(context: Context, pdfName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_DOC_NAME_ORIGINAL, pdfName)
                    .apply()
        }

        fun getPDFName(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_DOC_NAME_ORIGINAL, "")
        }


        fun savePaperSpecId(context: Context, paperSpecId: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_PAPER_SPEC_ID, paperSpecId)
                    .apply()
        }

        fun getPaperSpecId(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_PAPER_SPEC_ID, "")
        }

        fun saveOrderId(context: Context, paperSpecId: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_DOC_ORDER_ID, paperSpecId)
                    .apply()
        }

        fun getOrderId(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_DOC_ORDER_ID, "")
        }


        fun saveFilePath(context: Context, printerName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_DOC_PATH, printerName)
                    .apply()
        }

        fun getFilePath(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_DOC_PATH, "")
        }


        /**
         * BEGINNING  ----PREFERENCES FOR USER
         */
        fun saveUserId(context: Context, userId: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_USER_ID, userId)
                    .apply()
        }

        fun getUserId(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_USER_ID, 0)
        }

        fun saveUserName(context: Context, userName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_USERNAME, userName)
                    .apply()
        }

        fun getUserName(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_USERNAME, "")
        }

        fun saveUserEmail(context: Context, userEmail: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_EMAIL, userEmail)
                    .apply()
        }

        fun getUserEmail(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_EMAIL, "")
        }

        fun saveUserFirstName(context: Context, userFirstName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_FIRST_NAME, userFirstName)
                    .apply()
        }

        fun getUserFirstName(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_FIRST_NAME, "")
        }

        fun saveUserLastName(context: Context, userLastName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_LAST_NAME, userLastName)
                    .apply()
        }

        fun getUserLastName(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_LAST_NAME, "")
        }


        fun saveUserFullName(context: Context, userFullName: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_FULL_NAME, userFullName)
                    .apply()
        }

        fun getUserFullName(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_FULL_NAME, "")
        }


        fun saveUserBirthDate(context: Context, userBirthDate: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_BIRTH_DATE, userBirthDate)
                    .apply()
        }

        fun getUserBirthDate(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_BIRTH_DATE, "")
        }


        fun saveUserGender(context: Context, userGender: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_GENDER, userGender)
                    .apply()
        }

        fun getUserGender(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_GENDER, "")
        }

        fun saveUserPhoneNumber(context: Context, userPhoneNumber: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_PHONE_NUMBER, userPhoneNumber)
                    .apply()
        }

        fun getUserPhoneNumber(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_PHONE_NUMBER, "")
        }

        fun saveUserAddress(context: Context, userAddress: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_ADDRESS, userAddress)
                    .apply()
        }

        fun getUserAddress(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_ADDRESS, "")
        }

        fun saveUserAvatarUrl(context: Context, userAvatarUrl: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_AVATAR_URL, userAvatarUrl)
                    .apply()
        }

        fun getUserAvatarUrl(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_AVATAR_URL, "")
        }

        fun saveUserPostalCode(context: Context, userPostalCode: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_POSTAL_CODE, userPostalCode)
                    .apply()
        }

        fun getUserPostalCode(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_POSTAL_CODE, "")
        }


        fun saveUserCountryId(context: Context, userCountryId: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_USER_COUNTRY_ID, userCountryId)
                    .apply()
        }

        fun getUserCountryId(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_USER_COUNTRY_ID, 0)
        }

        fun saveUserProvinceId(context: Context, userProvinceId: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_USER_PROVINCE_ID, userProvinceId)
                    .apply()
        }

        fun getUserProvinceId(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_USER_PROVINCE_ID, 2)
        }

        fun saveUserCityId(context: Context, userCityId: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_USER_CITY_ID, userCityId)
                    .apply()
        }

        fun getUserCityId(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_USER_CITY_ID, 5)
        }

        fun saveUserDistrictId(context: Context, userDistrictId: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_USER_DISTRICT_ID, userDistrictId)
                    .apply()
        }

        fun getUserDistrictId(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_USER_DISTRICT_ID, 4)
        }

        fun saveUserVillageId(context: Context, userVillageId: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_USER_VILLAGE_ID, userVillageId)
                    .apply()
        }

        fun getUserVillageId(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_USER_VILLAGE_ID, 6)
        }


        fun saveIntentViewPagerOrderHistory(context: Context, userSelectedPosition: Int) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putInt(PREF_USER_SELECTED_FRAGMENT_ORDER_HISTORY, userSelectedPosition)
                    .apply()
        }

        fun getIntentViewPagerOrderHistory(context: Context): Int {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(PREF_USER_SELECTED_FRAGMENT_ORDER_HISTORY, 0)
        }


        fun saveSelectedColor(context: Context, selectedColor: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_SELECTED_COLOR, selectedColor)
                    .apply()
        }

        fun getSelectedColor(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_SELECTED_COLOR, "")
        }

        fun saveSelectedSize(context: Context, selectedSize: String) {
            val editor = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit()
            editor.putString(PREF_USER_SELECTED_SIZE, selectedSize)
                    .apply()
        }

        fun getSelectedSize(context: Context): String {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            return sharedPreferences.getString(PREF_USER_SELECTED_SIZE, "")
        }

        /**
         * END OF  ---- PREFERENCES FOR USER
         */





        fun clearPref(context: Context) {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.clear()
            editor.apply()
        }
    }


}