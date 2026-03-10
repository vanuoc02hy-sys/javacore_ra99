package com.vti.entity;

import java.util.Date;

public class Group {
     private int groupID;
     private String groupName;
     private int creator;
     private Date createDate;
     private Account[] accounts;

     public Group() {
     }

//     Có các parameter là GroupName, Creator, array com.vti.entity.Account[] accounts, CreateDate
     public Group(String groupName, int creator, Account[] accounts, Date createDate){
          this.groupName = groupName;
          this.creator = creator;
          this.accounts = accounts;
          this.createDate = createDate;
     }

//     Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
     public Group(String groupName, int creator, String[] usernames, Date createDate){
          Account[] accounts = new Account[usernames.length];
          for (int i = 0; i < usernames.length; i++) {
               String username = usernames[i];
               Account account = new Account(username);
               accounts[i] = account;
          }

          this.accounts = accounts;
          this.groupName = groupName;
          this.creator = creator;
          this.createDate = createDate;
     }

     // getter , setter

     public int getGroupID() {
          return groupID;
     }

     public void setGroupID(int groupID) {
          this.groupID = groupID;
     }

     public String getGroupName() {
          return groupName;
     }

     public void setGroupName(String groupName) {
          this.groupName = groupName;
     }

     public int getCreator() {
          return creator;
     }

     public void setCreator(int creator) {
          this.creator = creator;
     }

     public Date getCreateDate() {
          return createDate;
     }

     public void setCreateDate(Date createDate) {
          this.createDate = createDate;
     }

     public Account[] getAccounts() {
          return accounts;
     }

     public void setAccounts(Account[] accounts) {
          this.accounts = accounts;
     }
}
