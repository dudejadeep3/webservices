package com.tutorial.soap;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("You need to pass the IP Address");
		}
		else{
			String ipAddress = args[0];
			GeoIPService geoIpService = new GeoIPService();
			GeoIPServiceSoap geoIpServiceSOAP= geoIpService.getGeoIPServiceSoap();
			GeoIP geoIp= geoIpServiceSOAP.getGeoIP(ipAddress);
			System.out.println("The country for the ipaddress is: "+geoIp.getCountryName());
		}
	}
}
