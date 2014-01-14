package com.speedruntools.racebot;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;

public class Main {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration.Builder().setName("SRTRaceBot").addListener(new SRTRaceBot()).setServerHostname("irc2.speedrunslive.com")
				.addAutoJoinChannel("#srt").buildConfiguration();
		new PircBotX(configuration);
	}

}
