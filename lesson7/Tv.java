package lesson7;

public class Tv {
	// 변수 channel , volume , serialNumber 1 2 3 4 5 6 
	// 메소드 volumeUp, volumeDown, channelUp, channelDown
	
	private int channel, volume, serialNumber= 0 ;
	
	public static int count=0 ; 
	
	
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
	public Tv() {
		count++;
		serialNumber = count ;
	}
	
	public void volumeUp(int vNum) {
		volume += vNum ;
	}
	public void volumeDown(int vNum) {
		volume -= vNum ;
	}
	public void channelUp(int cNum) {
		channel+= cNum ;
	}
	public void channelDown(int cNum) {
		channel-= cNum ;
	}
}
