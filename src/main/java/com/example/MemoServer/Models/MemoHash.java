package com.example.MemoServer.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class MemoHash {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String folder;
    private String hash0;
    private String hash1;
    private String hash2;
    private String hash3;
    private String hash4;
    private String hash5;
    private String hash6;
    private String hash7;
    private String hash8;
    private String hash9;
    private String hash10;
    private String hash11;
    private String hash12;
    private String hash13;
    private String hash14;
    private String hash15;

    public Long getId() {
        return id;
    }

    public String getFolder() {
        return folder;
    }

    public String getHash0() {
        return hash0;
    }


    public String getHash1() {
        return hash1;
    }

    public String getHash2() {
        return hash2;
    }

    public String getHash3() {
        return hash3;
    }

    public String getHash4() {
        return hash4;
    }

    public String getHash5() {
        return hash5;
    }

    public String getHash6() {
        return hash6;
    }

    public String getHash7() {
        return hash7;
    }

    public String getHash8() {
        return hash8;
    }

    public String getHash9() {
        return hash9;
    }

    public String getHash10() {
        return hash10;
    }

    public String getHash11() {
        return hash11;
    }

    public String getHash12() {
        return hash12;
    }

    public String getHash13() {
        return hash13;
    }

    public String getHash14() {
        return hash14;
    }

    public String getHash15() {
        return hash15;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public void setHash0(String hash0) {
        this.hash0 = hash0;
    }

    public void setHash1(String hash1) {
        this.hash1 = hash1;
    }

    public void setHash2(String hash2) {
        this.hash2 = hash2;
    }

    public void setHash3(String hash3) {
        this.hash3 = hash3;
    }

    public void setHash4(String hash4) {
        this.hash4 = hash4;
    }

    public void setHash5(String hash5) {
        this.hash5 = hash5;
    }

    public void setHash6(String hash6) {
        this.hash6 = hash6;
    }

    public void setHash7(String hash7) {
        this.hash7 = hash7;
    }

    public void setHash8(String hash8) {
        this.hash8 = hash8;
    }

    public void setHash9(String hash9) {
        this.hash9 = hash9;
    }

    public void setHash10(String hash10) {
        this.hash10 = hash10;
    }

    public void setHash11(String hash11) {
        this.hash11 = hash11;
    }

    public void setHash12(String hash12) {
        this.hash12 = hash12;
    }

    public void setHash13(String hash13) {
        this.hash13 = hash13;
    }

    public void setHash14(String hash14) {
        this.hash14 = hash14;
    }

    public void setHash15(String hash15) {
        this.hash15 = hash15;
    }
    public void setHash(int i, String hash)
    {
        switch(i)
        {
            case 0:
                this.hash0 = hash;
                break;
            case 1:
                this.hash1 = hash;
                break;
            case 2:
                this.hash2 = hash;
                break;
            case 3:
                this.hash3 = hash;
                break;
            case 4:
                this.hash4 = hash;
                break;
            case 5:
                this.hash5 = hash;
                break;
            case 6:
                this.hash6 = hash;
                break;
            case 7:
                this.hash7 = hash;
                break;
            case 8:
                this.hash8 = hash;
                break;
            case 9:
                this.hash9 = hash;
                break;
            case 10:
                this.hash10 = hash;
                break;
            case 11:
                this.hash11 = hash;
                break;
            case 12:
                this.hash12 = hash;
                break;
            case 13:
                this.hash13 = hash;
                break;
            case 14:
                this.hash14 = hash;
                break;
            case 15:
                this.hash15 = hash;
                break;
            default:
                System.out.println();
                // code block
        }

    }

}
