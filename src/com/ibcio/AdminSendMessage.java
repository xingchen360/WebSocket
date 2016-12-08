package com.ibcio;

public class AdminSendMessage {
	public static void sendMessageToAllClient(String message){
		WebSocketMessageInboundPool.sendMessage(message.toString());
		WebSocketMessageInboundPool.sendMessageToUser("游客1",message.toString());
		//WebSocketMessageInboundPool.sendMessageToUser("游客2",message.toString());
	}
}
