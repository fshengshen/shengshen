package unit.test.common.service;

import org.apache.http.client.utils.URIBuilder;

public abstract class AbstractTest {
	protected String app = "localhost:8080/mb-memp";
	
	protected URIBuilder URIBuilder(String path) {
		return new URIBuilder().setScheme("http").setHost(app + path);
	}
}
