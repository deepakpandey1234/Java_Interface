/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newplay;

/**
 * <p>Title: 接口和抽象函数</p> <p>Description: 演示继承抽象函数和实现接口</p> <p>Copyright:
 * Copyright (c) 2003</p> <p>Filename: newPlay.java</p>
 *
 * @author 杜江
 * @version 1.0
 */
//接口 
interface player {

	int flag = 1;

	void play();//播放

	void pause();//暂停

	void stop();//停止
}//end :)

//抽象类
abstract class playing {

	public void display(Object oPara) {
		System.out.println(oPara);
	}

	abstract void winRun();
}//end :)

//继承了playing抽象类和实现类player接口
public class NewPlay extends playing implements player {

	@Override
	public void play() {
		display("newPlay.play()");//这里只是演示，去掉了代码。
	}

	@Override
	public void pause() {
		display("newPlay.pause()");//这里只是演示，去掉了代码。
	}

	/**
	 *
	 */
	@Override
	public void stop() {
		display("newPlay.stop()");//这里只是演示，去掉了代码。
	}

	@Override
	void winRun() {
		display("newPlay.winRun()");//这里只是演示，去掉了代码。
	}

	public static void main(String[] args) {
		NewPlay p = new NewPlay();
		p.play();
		p.pause();
		p.stop();
		p.winRun();
	}
}//end :)
