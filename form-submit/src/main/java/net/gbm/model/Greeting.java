package net.gbm.model;

public class Greeting {
	private Long id;
	private String content;

	public String getContent() {
		return content;
	}

	public Long getId() {
		return id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}

}
