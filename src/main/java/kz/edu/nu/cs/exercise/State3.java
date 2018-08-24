package kz.edu.nu.cs.exercise;

public class State3 extends State {
	public State3(StateContext sc) {
		this.sc = sc;
		this.accept = true;
	}
	
	public boolean isAccept() {
        return this.accept;
    }
	
	public void actionA() {
		this.sc.setCurrentState(sc.state3);
	}
	
	public void actionB() {
		this.sc.setCurrentState(sc.state2);
	}
}
