package dev.dumble.minigames.mongo;

import com.mongodb.client.MongoCollection;

public interface IMongoAdapter {

    <T> MongoCollection<T> collection(String name, Class<T> type);

    void close();
}