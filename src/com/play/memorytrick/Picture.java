package com.play.memorytrick;

import android.widget.Button;

public class Picture {
	
	public int x;
	public int y;
	public Button button;
	
	public Picture(Button button, int x,int y) {
		this.x = x;
		this.y=y;
		this.button=button;
	}

}
