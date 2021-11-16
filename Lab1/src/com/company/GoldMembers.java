package com.company;

public class GoldMembers extends MembershipType{
//    public GoldMembers(int points) {
//        if (points >= 20) {
//            super.points = points;
//        }
//        else {
//            System.out.println("Gold Members have 20 points or more");
//        }
//    }

    @Override
    public void showMembershipType() {
        System.out.println("Gold Member");
    }
}
