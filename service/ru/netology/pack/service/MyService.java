package ru.netology.pack.service;

import ru.netology.pack.db.Db;
import ru.netology.pack.db.DbSetting;
import ru.netology.pack.db.MyEntity;

import java.util.UUID;

public class MyService {

    private DbSetting dbSetting = new DbSetting("name", "password");
    private String name = "myService";
    private Db db = new Db(dbSetting);

    public String getName() {
        return name;
    }

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }
}