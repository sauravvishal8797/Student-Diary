package Details;

public class Address {
	
	private String NativeState;
	private String NativeDistrict;
	private String NativeCity;
	private String StreetAdress;
	private String LocalAddress;
	
	public Address(String NativeState, String NativeDistrict, String NativeCity, String StreetAdress, String LocalAddress) {
		this.NativeState = NativeState;
		this.NativeDistrict = NativeDistrict;
		this.NativeCity = NativeCity;
		this.StreetAdress = StreetAdress;
		this.LocalAddress = LocalAddress;
	}
	
	public String getNativeState() {
		return NativeState;
	}
	
	public void setNativeState(String nativeState) {
		NativeState = nativeState;
	}
	
	public String getNativeDistrict() {
		return NativeDistrict;
	}
	
	public void setNativeDistrict(String nativeDistrict) {
		NativeDistrict = nativeDistrict;
	}
	
	public String getStreetAdress() {
		return StreetAdress;
	}
	
	public void setStreetAdress(String streetAdress) {
		StreetAdress = streetAdress;
	}
	
	public String getLocalAddress() {
		return LocalAddress;
	}
	
	public void setLocalAddress(String localAddress) {
		LocalAddress = localAddress;
	}
	
	public String getNativeCity() {
		return NativeCity;
	}
	
	public void setNativeCity(String nativeCity) {
		NativeCity = nativeCity;
	}
}
	
