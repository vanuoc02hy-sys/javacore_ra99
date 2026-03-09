package data;

import modal.Group;

public class GroupData {
    public static Group[] groupArray(){
        Group group1 = new Group();
        group1.groupName = "NHóm 1";
        Group group2 = new Group();
        Group group3 = new Group();
        Group[] ds1 = {group1, group2, group3, group1};
        return ds1;
    }
}
