
public class Parked_CarOwner_Details {
	
	private String ownerName;
	private String carModel;
	private Integer carNO;
	private long ownerMobileNO;
	private String ownerAddress;
	
	public Parked_CarOwner_Details(String ownerName, String carModel, Integer carNO, long ownerMobileNO,
			String ownerAddress) {
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.ownerMobileNO = ownerMobileNO;
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public Integer getCarNO() {
		return carNO;
	}
	public void setCarNO(Integer carNO) {
		this.carNO = carNO;
	}
	public long getOwnerMobileNO() {
		return ownerMobileNO;
	}
	public void setOwnerMobileNO(long ownerMobileNO) {
		this.ownerMobileNO = ownerMobileNO;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
}
