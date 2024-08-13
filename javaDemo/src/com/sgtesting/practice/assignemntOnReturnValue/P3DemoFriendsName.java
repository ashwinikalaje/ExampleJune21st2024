package com.sgtesting.practice.assignemntOnReturnValue;

class FriendsnNameDisplay
{
    String[] getFriendName(String friendList[])
    {
        return friendList;
    }

}
public class P3DemoFriendsName {
    public static void main(String[] args) {
        FriendsnNameDisplay o=new FriendsnNameDisplay();
        String s1[]={"1.archu","2.sach","3.pooja"};
        String s2[]=o.getFriendName(s1);
        System.out.println("friends list are:");
        for(String kk:s2)
        {
            System.out.println(kk);
        }

    }
}
