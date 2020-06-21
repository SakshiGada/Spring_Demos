package com.llearning.VideoStreamingApp.mainservice;

import com.llearning.VideoStreamingApp.VideoType;
import com.llearning.VideoStreamingApp.devices.DeviceType;
import com.llearning.VideoStreamingApp.services.ServiceType;

public class VideoStreamingService 
{
	ServiceType serviceType;
	DeviceType deviceType;
	VideoType videoType;
	public DeviceType getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}
	public ServiceType getServiceType() {
		return serviceType;
	}
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	public VideoType getVideoType() {
		return videoType;
	}
	public void setVideoType(VideoType videoType) {
		this.videoType = videoType;
	}
	public void watch()
	{
		System.out.println("Let's watch "+videoType.getVideoName()+" of "+serviceType.getServiceName()+" on "+deviceType.getDeviceName());
	}
}
