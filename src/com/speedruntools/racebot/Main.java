package com.speedruntools.racebot;

import org.pircbotx.PircBotX;

public class Main {
	public static void main(String[] args) throws Exception {
		PircBotX bot = new PircBotX();
		bot.getListenerManager().addListener(new SRTRaceBot());
		bot.setName("SrtRaceBot");
		bot.setVerbose(true);
		bot.setAutoReconnect(true);
		bot.setAutoReconnectChannels(true);
		bot.connect("irc.speedrunslive.com", 6667);
		Thread.sleep(1000);
		bot.joinChannel("#srt");
		Thread.sleep(1000);
	}

}
