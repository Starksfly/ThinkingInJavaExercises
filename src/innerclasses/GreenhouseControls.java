package innerclasses;

import innerclasses.controller.*;
import javafx.scene.effect.Light;

public class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) { super(delayTime); }
        public void action() {
            light = true;
        }
        public String toString() { return "Light is on"; }
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime); }
        public void action() {
            light = false;
        }
        public String toString() { return "Light is off"; }
    }
    private boolean fan = false;
    public class FanOn extends Event {
        public FanOn(long delayTime) { super(delayTime); }
        public void action() {
            fan = true;
        }
        public String toString() { return "Fan is on"; }
    }
    public class FanOff extends Event {
        public FanOff(long delayTime) { super(delayTime); }
        public void action() {
            fan = false;
        }
        public String toString() { return "Fan is off"; }
    }
}
