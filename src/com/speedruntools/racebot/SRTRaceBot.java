package com.speedruntools.racebot;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.JoinEvent;
import org.pircbotx.hooks.events.MessageEvent;

public class SRTRaceBot extends ListenerAdapter {
	

	public void onJoin(JoinEvent event) throws Exception {
		
	}

	public void onMessage(MessageEvent event) throws Exception {

		Thread.sleep(3000);
	}

	

}
