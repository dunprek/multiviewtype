package don.com.multiviewtype.model.printerList;


import com.google.gson.annotations.SerializedName;


public class ImagesItem{

	@SerializedName("sequence")
	private int sequence;

	@SerializedName("filename")
	private String filename;

	@SerializedName("is_primary")
	private boolean isPrimary;

	@SerializedName("printer_id")
	private int printerId;

	@SerializedName("id")
	private int id;

	@SerializedName("filename_url")
	private String filenameUrl;

	public void setSequence(int sequence){
		this.sequence = sequence;
	}

	public int getSequence(){
		return sequence;
	}

	public void setFilename(String filename){
		this.filename = filename;
	}

	public String getFilename(){
		return filename;
	}

	public void setIsPrimary(boolean isPrimary){
		this.isPrimary = isPrimary;
	}

	public boolean isIsPrimary(){
		return isPrimary;
	}

	public void setPrinterId(int printerId){
		this.printerId = printerId;
	}

	public int getPrinterId(){
		return printerId;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFilenameUrl(String filenameUrl){
		this.filenameUrl = filenameUrl;
	}

	public String getFilenameUrl(){
		return filenameUrl;
	}

	@Override
 	public String toString(){
		return 
			"ImagesItem{" + 
			"sequence = '" + sequence + '\'' + 
			",filename = '" + filename + '\'' + 
			",is_primary = '" + isPrimary + '\'' + 
			",printer_id = '" + printerId + '\'' + 
			",id = '" + id + '\'' + 
			",filename_url = '" + filenameUrl + '\'' + 
			"}";
		}
}