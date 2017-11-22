package com.test.design.structural.adapter;

/**
 * 主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
 * 优点： 1、可以让任何两个没有关联的类一起运行。 (Mp4Player及VlcPlayer在MediaAdapter一起運行)
 *     2、提高了类的复用。 
 *     3、增加了类的透明度。 
 *     4、灵活性好。
 * 
 * @author Bryant
 *
 */
public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
