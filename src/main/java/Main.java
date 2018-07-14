
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.client.*;
import org.bson.Document;

import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        MongoClient mongoClient = MongoClients.create();
        MongoDatabase database = mongoClient.getDatabase("codementors");

        MongoCollection<Document> users = database.getCollection("users");

        Block<Document> printBlock = document -> System.out.println(document.toJson());

    }
}
