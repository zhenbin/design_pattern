package app.adapter;

import com.oozinoz.firework.PhysicalRocket;
import com.oozinoz.simulation.RocketSim;

/**
 * Created by zhenbin.lzb on 2016/4/8.
 */
public class OozinoRocket extends PhysicalRocket implements RocketSim {

    private double time;

    public OozinoRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        super(burnArea, burnRate, fuelMass, totalMass);
    }

    public double getMass() {
        return getMass(time);
    }

    public double getThrust() {
        return getThrust(time);
    }

    public void setSimTime(double t) {
        time = t;
    }
}
