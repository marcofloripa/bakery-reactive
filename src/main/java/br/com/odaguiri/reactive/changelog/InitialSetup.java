package br.com.odaguiri.reactive.changelog;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@ChangeLog
public class InitialSetup {

	@ChangeSet(order = "001", id = "insertProducts", author = "Marco Odaguiri")
	public void insertProducts(MongoDatabase db) {
		MongoCollection<Document> products = db.getCollection("products");
		Document cf = new Document("code", "CF");	
		Document vs5 = new Document("code", "VS5");
		Document mb11 = new Document("code", "MB11");
		List<Document> documents = new ArrayList<>();
		documents.add(cf);
		documents.add(vs5);
		documents.add(mb11);
		products.insertMany(documents);
	}
}
