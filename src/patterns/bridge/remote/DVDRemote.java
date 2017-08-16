package patterns.bridge.remote;

import patterns.bridge.Device.EntertainmentDevice;

/**
 * Created by Jiawei on 7/12/17.
 */

// Refined Abstraction

// If I decide I want to further extend the remote I can

public class DVDRemote extends RemoteButton{

    private boolean play = true;

    public DVDRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        play = !play;

        System.out.println("DVD is Playing: " + play);

    }

}