package Practice;

public class Tv {
	// 변수 channel , volume , serialNumber 1 2 3 4 5 6 
	// 메소드 volumeUp, volumeDown, channelUp, channelDown
	
	private int channel, volume ,  serialNumber = 0;
	
	public static int count ;
	
	public Tv() {
		count++;
		serialNumber = count ;
	}

	
	
	
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


	
}
