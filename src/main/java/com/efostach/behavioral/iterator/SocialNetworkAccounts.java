package com.efostach.behavioral.iterator;

public class SocialNetworkAccounts implements Collection {
    private String socialNetworkName;
    private String[] friends;


    public SocialNetworkAccounts (String socialNetworkName, String[] friends) {
        this.socialNetworkName = socialNetworkName;
        this.friends = friends;
    }

    public String getSocialNetworkName() {
        return socialNetworkName;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setSocialNetworkName(String socialNetworkName) {
        this.socialNetworkName = socialNetworkName;
    }


    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    @Override
    public Iterator getIterator() {
        return new AccountIterator();
    }

    private class AccountIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < friends.length) {
                return true;
            } else return false;
        }

        @Override
        public Object getNext() {
            return friends[index++];
        }
    }
}
