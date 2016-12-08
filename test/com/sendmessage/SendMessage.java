package com.sendmessage;

import java.util.Set;

import com.ibcio.WebSocketMessageInboundPool;

public class SendMessage {
	public static void main(String[] args) {
		String message = "{\"from\":\"游客1\",\"content\":\"我是从后台来的消息\",\"timestamp\":1481168013909,\"type\":\"message\"}";
		WebSocketMessageInboundPool.sendMessage(message.toString());
		Set<String> users = WebSocketMessageInboundPool.getOnlineUser();
		System.out.println(users);
	}
}
