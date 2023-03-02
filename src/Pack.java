package src;

import java.util.ArrayList;

public class Pack {

	private int packid;

	private ArrayList UAVList;

	private static Pack packInstance;

	private UAVDeployment uAVDeployment;

	private Pack() {

	}

	public static Pack getInstance() {
		if(packInstance == null){
			packInstance = new Pack();
		}
		return packInstance;
	}

	public void addUAV(int uav) {

	}

	public void removeUAV(int uav) {

	}

}
