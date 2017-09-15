package com.boyer.challenge1.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MobileAssociationController {
	
	//Create a user
	//Check in
	//return users and status
	/*
	private static int MINUTES_TO_TIMEOUT = 15;
	@RequestMapping("/formAssociation")
	public void establishSocket() {
		
		try (ServerSocket server = new ServerSocket()) {
		
			while (true) {
				try (Socket connection = server.accept()) {
					
					connection.setSoTimeout((int) TimeUnit.MINUTES.toMillis(
						MobileAssociationController.MINUTES_TO_TIMEOUT
					));
					
					InputStream in = connection.getInputStream();
					//Get id from client
					
					OutputStream out = connection.getOutputStream();
					String responseData = "";
					out.write(responseData);
					out.flush();
					//connection.close();
				} catch (SocketTimeoutException ex) {}
				
			}
			catch (IOException ex) {
				System.err.println(ex);
			}
				
		}
	}
	*/
	
	//TODO: convert from byte stream to text
	//TODO: encrypt the output stream
	//TODO: Check if socket is still active
	/*
	public static int DEFAULT_PORT = 7;
	int port;
	ServerSocketChannel serverChannel;
	Selector selector;
	try {
	    serverChannel = ServerSocketChannel.open();
	    ServerSocket ss = serverChannel.socket();
	    InetSocketAddress address = new InetSocketAddress(port);
	    ss.bind(address);
	    serverChannel.configureBlocking(false);
	    selector = Selector.open();
	    serverChannel.register(selector, SelectionKey.OP_ACCEPT);
	}
	 catch (IOException ex) {
	    ex.printStackTrace();
	    return;
	}
	while (true)  {
	   try {
	      selector.select();
	    } catch (IOException ex) {
	        ex.printStackTrace();
	        break;
	    }
	    Set<SelectionKey> readyKeys = selector.selectedKeys();
	    Iterator<SelectionKey> iterator = readyKeys.iterator();
	    while (iterator.hasNext())             {
	        SelectionKey key = iterator.next();
	        iterator.remove();
	        try  {
	          if (key.isAcceptable()) {
	                ServerSocketChannel server = (ServerSocketChannel) key.channel();
	                SocketChannel client = server.accept();
	                System.out.println("Accepted connection from " + client);
	                //TODO: Process information
	                //Use test data for now
	                client.configureBlocking(false);
	                SelectionKey clientKey = client.register(selector, SelectionKey.OP_WRITE | SelectionKey.OP_READ);
	                ByteBuffer buffer = ByteBuffer.allocate(100);
	                clientKey.attach(buffer);
	            }
	            if (key.isReadable()) {
	                SocketChannel client = (SocketChannel) key.channel();
	                ByteBuffer output = (ByteBuffer) key.attachment();
	                //Send test data back
	                client.read(output);
	            }
	            if (key.isWritable())                     {
	                SocketChannel client = (SocketChannel) key.channel();
	                ByteBuffer output = (ByteBuffer) key.attachment();
	                output.flip();
	                client.write(output);
	                output.compact();
	            }
	        }
	         catch (IOException ex) {
	            key.cancel();
	            try {
	              key.channel().close();
	            }
	             catch (IOException cex) {cex.printStackTrace();
	            }
	        }
	    }
	}
	*/
}
