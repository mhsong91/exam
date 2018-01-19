package p17ee;

public class UserInto {

	private int uino;
	private String uiName;
	private int uiAge;
	private String uiid;
	private String uipwd;
	private int cino;
	private String uiRegDate;
	public int getUino() {
		return uino;
	}
	public void setUino(int uino) {
		this.uino = uino;
	}
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public int getUiAge() {
		return uiAge;
	}
	public void setUiAge(int uiAge) {
		this.uiAge = uiAge;
	}
	public String getUiid() {
		return uiid;
	}
	public void setUiid(String uiid) {
		this.uiid = uiid;
	}
	public String getUipwd() {
		return uipwd;
	}
	public void setUipwd(String uipwd) {
		this.uipwd = uipwd;
	}
	public int getCino() {
		return cino;
	}
	public void setCino(int cino) {
		this.cino = cino;
	}
	public String getUiRegDate() {
		return uiRegDate;
	}
	public void setUiRegDate(String uiRegDate) {
		this.uiRegDate = uiRegDate;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Connector [uino=" + uino + ", uiName=" + uiName + ", uiAge=" + uiAge + ", uiid=" + uiid + ", uipwd="
				+ uipwd + ", cino=" + cino + ", uiRegDate=" + uiRegDate + ", adress=" + adress + "]";
	}
	private String adress;
	
}
