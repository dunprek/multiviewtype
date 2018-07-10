package don.com.multiviewtype.base

import android.app.DatePickerDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.Settings
import android.support.design.widget.Snackbar
import android.support.design.widget.Snackbar.LENGTH_INDEFINITE
import android.support.design.widget.TextInputLayout
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.text.TextUtils
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.*
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.SimpleDateFormat
import java.util.*
import com.facebook.AccessToken
import don.com.multiviewtype.R
import org.json.JSONArray
import org.json.JSONObject


/**
 * Created by gideon on 09/04/18.
 */

@Suppress("INTEGER_OVERFLOW")
abstract class BaseActivity : AppCompatActivity() {



    var c = Calendar.getInstance()
    lateinit var dateSetListener: DatePickerDialog.OnDateSetListener

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item!!.itemId == android.R.id.home) {
            supportFinishAfterTransition()
//            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }




    fun startProgress() {


    }

    fun stopProgress() {


    }

    fun ErrorProgress(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
    }


    fun showBackArrow() {
        val toolbar = supportActionBar
        if (toolbar != null) {
            toolbar.setDisplayHomeAsUpEnabled(true)
        } else {
            showErrorAlert("Toolbar is not set")
        }
    }

    fun hideBackArrow() {
        val toolbar = supportActionBar
        if (toolbar != null) {
            toolbar.setDisplayHomeAsUpEnabled(false)
        } else {
            showErrorAlert("Toolbar is not set")
        }
    }


    //base activity
    fun setToolbarTitle(title: String) {
        val toolbar = supportActionBar
        if (toolbar != null) {
            toolbar.setTitle(title)
        } else {
            showErrorAlert("Toolbar is not set")
        }
    }

    fun showErrorAlert(message: String) {
        val alertDialog = AlertDialog.Builder(this)
                .setTitle(R.string.alert_title)
                .setMessage(message)
                .setPositiveButton(R.string.alert_close, DialogInterface.OnClickListener { dialog, which ->
                    if (message.contains("404")) {
//                        logout()
                    } else {
                        dialog.dismiss()
                    }
                })
                .create()
        alertDialog.show()

        //set dialog button color
        //get color
        val buttonColor = resources.getColor(R.color.colorAccent)
        //get the positive button
        val pbutton = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
        //set the color to the buttton
        pbutton.setTextColor(buttonColor)
    }

    fun showAlert(title: String, message: String) {
        val alertDialog = AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(R.string.alert_close, DialogInterface.OnClickListener { dialog, which ->
                    if (message.contains("404")) {
//                        logout()
                    } else {
                        dialog.dismiss()
                    }
                })
                .create()
        alertDialog.show()

        //set dialog button color
        //get color
        val buttonColor = resources.getColor(R.color.colorAccent)
        //get the positive button
        val pbutton = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
        //set the color to the buttton
        pbutton.setTextColor(buttonColor)
    }

    fun showDialogCall(title: String, message: String, phoneNumber: String?) {
        val alertDialog = AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message + " " + phoneNumber)
                .setPositiveButton(R.string.alert_yes, { dialog, which ->
                    val intent = Intent(Intent.ACTION_DIAL)
                    intent.data = Uri.parse("tel:" + phoneNumber)
                    startActivity(intent)
                    dialog.dismiss()
                })
                .setNegativeButton(R.string.alert_no, { dialog, which ->
                    showToast("negatif")
                    dialog.dismiss()
                })
                .create()
        alertDialog.show()

        //set dialog button color
        //get color
        val buttonColor = resources.getColor(R.color.colorPrimary)
        //get the positive button
        val pButton = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
        //get the negative button
        val nButton = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE)

        //set the color to the buttton
        pButton.setTextColor(buttonColor)
        nButton.setTextColor(buttonColor)
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }



    fun tag(name: String, value: String) {
        Log.wtf(name, value)
    }


    /**
     * Shows a [Snackbar].
     *
     * @param snackStrId The id for the string resource for the Snackbar text.
     * @param actionStrId The text of the action item.
     * @param listener The listener associated with the Snackbar action.
     */
    fun showSnackbar(
            snackStrId: Int,
            actionStrId: Int = 0,
            listener: View.OnClickListener? = null
    ) {
        val snackbar = Snackbar.make(findViewById(android.R.id.content), getString(snackStrId),
                LENGTH_INDEFINITE)
        if (actionStrId != 0 && listener != null) {
            snackbar.setAction(getString(actionStrId), listener)
        }
        snackbar.show()
    }


    fun checkET(charSequence: CharSequence, textInputLayout: TextInputLayout, editText: EditText): Boolean {
        if (TextUtils.isEmpty(editText.text.toString())) {
            editText.error = "${textInputLayout.hint} " + "tidak boleh kosong"
            return false
        } else {
            isEmailValid(charSequence)
        }
        return true
    }

    fun checkET(textInputLayout: TextInputLayout, editText: EditText): Boolean {
        if (TextUtils.isEmpty(editText.text.toString())) {
            editText.error = "${textInputLayout.hint} " + "tidak boleh kosong"
            return false
        }
        return true
    }

    /*
        fun isEmailValid(email: CharSequence, editText: EditText, textInputLayout: TextInputLayout): Boolean {
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                editText.error = "${textInputLayout.hint} " + "format tidak sesuai"
                return false
            }
            return true
        }*/
    fun isEmailValid(email: CharSequence): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun checkETStatus(editText: EditText): Boolean {
        if (TextUtils.isEmpty(editText.text.toString())) {
            editText.error = "${editText.hint} " + "tidak boleh kosong"
            return false
        }
        return true
    }


    fun formatRupiah(textView: TextView, money: Double?) {
        //        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        val kursIndonesia = DecimalFormat.getIntegerInstance() as DecimalFormat
        val formatRp = DecimalFormatSymbols()
        formatRp.setGroupingSeparator(',')
        //        formatRp.setCurrencySymbol("Rp. ");
        kursIndonesia.setDecimalFormatSymbols(formatRp)
        textView.text = kursIndonesia.format(money)
    }

    fun formatNumber(amount: Int?): String {
        //        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        val kursIndonesia = DecimalFormat.getIntegerInstance() as DecimalFormat
        val formatRp = DecimalFormatSymbols()
        formatRp.setGroupingSeparator(',')
        //        formatRp.setCurrencySymbol("Rp. ");
        kursIndonesia.setDecimalFormatSymbols(formatRp)
        return kursIndonesia.format(amount)
    }

    fun TextInputLayout.setRequired(required: Boolean, textInputLayout: TextInputLayout) {
        val redStar: String = "<font color='red'>*</font>"

        textInputLayout.setHint(
                TextUtils.concat(
                        textInputLayout.getHint(), Html.fromHtml(redStar)))
    }


    fun showEditTextsAsMandatory(vararg ets: EditText) {
        for (et in ets) {
            val hint = et.hint.toString()

            et.hint = Html.fromHtml("<font color=\"#ff0000\">* </font>$hint")
        }
    }

    fun removeDuplicates(list: ArrayList<String>): ArrayList<String> {

        // Store unique items in result.
        val result = ArrayList<String>()

        // Record encountered Strings in HashSet.
        val set = HashSet<String>()

        // Loop over argument list.
        for (item in list) {

            // If String is not in set, add it to the list and the set.
            if (!set.contains(item)) {
                result.add(item)
                set.add(item)
            }
        }
        return result
    }


    fun isLocationEnabled(context: Context): Boolean {
        var locationMode = 0
        val locationProviders: String

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            try {
                locationMode = Settings.Secure.getInt(context.getContentResolver(), Settings.Secure.LOCATION_MODE);

            } catch (e: Settings.SettingNotFoundException) {
                e.printStackTrace();
                return false;
            }

            return locationMode != Settings.Secure.LOCATION_MODE_OFF;

        } else {
            locationProviders = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
            return !TextUtils.isEmpty(locationProviders);
        }
    }


    //update et after picking the date
    fun updateEtBegin(editText: EditText, context: Context) {

        // Get Current Date

        val mYear = c.get(Calendar.YEAR)
        val mMonth = c.get(Calendar.MONTH)
        val mDay = c.get(Calendar.DAY_OF_MONTH)
        val upperLimit = 31556900000 * 15

        val now = System.currentTimeMillis() - 1000


        val datePickerDialog = DatePickerDialog(this,
                object : DatePickerDialog.OnDateSetListener {
                    override fun onDateSet(view: DatePicker, year: Int,
                                           monthOfYear: Int, dayOfMonth: Int) {
                        val myFormat = "yyyy-MM-DD" // mention the format you need
                        val sdf = SimpleDateFormat(myFormat, Locale.US)
                        editText.setText(sdf.format(c.getTime()))
                    }
                }, mYear, mMonth, mDay)
        datePickerDialog.datePicker.setMaxDate(now - (upperLimit))
        datePickerDialog.show()
    }




    fun getJsonErrorMessage(errorMessage: String) {
        try {
            val jObjError = JSONObject(errorMessage)
            if (jObjError.has("password")) {
                val onPassworError = (jObjError.getString("password"))
                val jArrayError = JSONArray(onPassworError)
                showErrorAlert(jArrayError[0].toString())
                Log.e("JSON ERROR", "ERROR - > " + jArrayError[0].toString())
            } else if (jObjError.has("email")) {
                val onEmailError = (jObjError.getString("email"))
                val jArrayError = JSONArray(onEmailError)
                showErrorAlert(jArrayError[0].toString())
                Log.e("JSON ERROR", "ERROR - > " + jArrayError[0].toString())
            }
            else if (jObjError.has("birthday")) {
                val onBirthDayError = (jObjError.getString("birthday"))
                val jArrayError = JSONArray(onBirthDayError)
                showErrorAlert(jArrayError[0].toString())
                Log.e("JSON ERROR", "ERROR - > " + jArrayError[0].toString())
            }
            else if (jObjError.has("message")) {
                val onBirthDayError = (jObjError.getString("message"))
                val jArrayError = JSONArray(onBirthDayError)
                showErrorAlert(jArrayError[0].toString())
                Log.e("JSON ERROR", "ERROR - > " + jArrayError[0].toString())
            }
        } catch (e: Exception) {
            showToast(e.message!!)
        }
    }


}

