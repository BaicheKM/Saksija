package com.baiches.app;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DiscordAPI api = Javacord.getApi("MzY1NTYxNDQ1ODE3MTIyODE3.DLgHNA.EgsPYX_eJxKr5RHXeStj3YBY0zA", true);
    	api.connectBlocking();
    	api.registerListener(new MessageCreateListener() {
			
			public void onMessageCreate(DiscordAPI api, Message message) {
				if (message.getContent().equalsIgnoreCase("ping")) {
					message.reply("/tts pong");
				}
			}
		});
    	
        System.out.println( "Hello World!" );
    }
}
