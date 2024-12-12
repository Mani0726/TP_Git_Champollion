package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe
    private int volumeCM;
    private int volumeTD;
    private int volumeTP;

    public ServicePrevu(int CM, int TD, int TP) {
        this.volumeCM = CM;
        this.volumeTD = TD;
        this.volumeTP = TP;

    }
    
    public int getVolumeCM() {
        return volumeCM;
    }
    public void setVolumeCM(int heuresCM) {
        this.volumeCM = heuresCM;
    }
    public int getVolumeTD() {
        return volumeTD;
    }
    public void setVolumeTD(int heuresTD) {
        this.volumeTD = heuresTD;
    }
    public int getVolumeTP() {
        return volumeTP;
    }
    public void setVolumeTP(int heuresTP) {
        this.volumeTP = heuresTP;
    }


}
