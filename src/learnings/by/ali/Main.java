package learnings.by.ali;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class Main {

	public static void main(String[] args) {
		GeoIPService service = new GeoIPService ();
		
		GeoIPServiceSoap port = service.getGeoIPServiceSoap ();
		GeoIP geoIP = port.getGeoIP ("212.58.244.20");
		System.out.println ("this IP belongs to : " + geoIP.getCountryName ());
	}

}
