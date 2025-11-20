package dev.dumble.minigames.mongo;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.ReplaceOptions;
import dev.dumble.minigames.MinigamesAPI;

import java.util.*;
import java.util.stream.Collectors;

public abstract class MongoRepository<K, V extends MongoEntity<K>> {

    protected final MongoCollection<V> collection;

    protected MongoRepository(String collectionName, Class<V> entityClass) {
        this.collection = MinigamesAPI.getInstance()
                .getMongoAdapter()
                .collection(collectionName, entityClass);
    }

    public void save(V entity) {
        collection.replaceOne(
                Filters.eq("_id", entity.getId()),
                entity,
                new ReplaceOptions().upsert(true)
        );
    }

    public Optional<V> find(K id) {
        return Optional.ofNullable(collection.find(Filters.eq("_id", id)).first());
    }

    public void delete(V entity) {
        collection.deleteOne(Filters.eq("_id", entity.getId()));
    }

    public Map<K, V> values() {
        return collection.find()
                .into(new ArrayList<>())
                .stream()
                .collect(Collectors.toMap(V::getId, v -> v));
    }
}