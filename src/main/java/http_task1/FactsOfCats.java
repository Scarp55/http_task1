package http_task1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FactsOfCats {

	String id;
	String text;
	String type;
	String user;
	int upvotes;

	public FactsOfCats() {
	}

	public FactsOfCats(@JsonProperty("id") String id, @JsonProperty("text") String text,
			@JsonProperty("type") String type, @JsonProperty("user") String user,
			@JsonProperty("upvotes") int upvotes) {
		this.id = id;
		this.text = text;
		this.type = type;
		this.user = user;
		this.upvotes = upvotes;
	}

	public String getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getType() {
		return type;
	}

	public String getUser() {
		return user;
	}

	public int getUpvotes() {
		return upvotes;
	}

	@Override
	public String toString() {
		return "FactAboutCat \n{\n" + "id = '" + id + '\'' + ",\n " + "text = '" + text + '\'' + ",\n " + "type = '"
				+ type + '\'' + ",\n " + "user = '" + user + '\'' + ",\n " + "upvotes = " + upvotes + "\n}\n";
	}

}
