/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efeitosSonoros;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author Igor
 */
public class tocarSom {
	public void tocar(String nomeAudio){
		URL url = getClass().getResource(nomeAudio+".wav");
		AudioClip audio = Applet.newAudioClip(url);
		audio.play();
	}
}
