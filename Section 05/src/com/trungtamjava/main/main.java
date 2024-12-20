package com.trungtamjava.main;

import com.trungtamjava.model.Table;
import com.trungtamjava.model.Chair;
import com.trungtamjava.model.Table;

public class main {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.setTenChair("Chair1");
        chair.setMaChair("ma1");
        chair.setLoaiChair("bep1");
        chair.setGiaChair(100);

        chair.inChair();

        Table table = new Table();
        table.setTenBan("Table1");
        table.setMaBan("ma1");
        table.setLoaiBan("bep1");
        table.setGiaBan(100);

        table.inban();
    }

}
