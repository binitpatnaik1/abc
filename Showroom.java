

public class Showroom {
	
	String sname;
	String location;
	String cname;
	String cmake;
	int gears;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmake() {
		return cmake;
	}
	public void setCmake(String cmake) {
		this.cmake = cmake;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public Showroom(String sname, String location, String cname, String cmake, int gears) {
		super();
		this.sname = sname;
		this.location = location;
		this.cname = cname;
		this.cmake = cmake;
		this.gears = gears;
	}
	@Override
	public String toString() {
		return "Showroom [sname=" + sname + ", location=" + location + ", cname=" + cname + ", cmake=" + cmake
				+ ", gears=" + gears + "]";
	}
	
	
		
	}


