package test;

import model.AccountPO;
import model.FriendRequest;
import dbutil.DaoImpl;

public class TestFriendRequest {
	public static void main(String args[]){
		DaoImpl daoImpl = new DaoImpl();
		FriendRequest friend = new FriendRequest();
		friend.setAction("request");
		friend.setSenderId("pusheng");
		friend.setReceiverId("haoyuc");		
		daoImpl.savefriendFequests(friend);
		
		friend.setAction("add");
		daoImpl.savefriendFequests(friend);
		
//		friend.setAction("reject");
//		daoImpl.savefriendFequests(friend);
//		
//		friend.setAction("delete");
//		daoImpl.savefriendFequests(friend);
		
	}
}
