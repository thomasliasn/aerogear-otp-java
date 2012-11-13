package org.abstractj.cuckootp.api;

public enum Hash {

    SHA1("HmacSHA1");

    private String hash;

    Hash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString(){
        return hash;
    }
}