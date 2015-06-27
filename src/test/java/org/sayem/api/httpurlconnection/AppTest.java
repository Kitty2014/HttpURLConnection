package org.sayem.api.httpurlconnection;

import org.sayem.api.httpurlconnection.api.utils.ContentType;
import org.sayem.api.httpurlconnection.api.utils.PostAdapter;
import org.sayem.api.httpurlconnection.api.utils.RestAdapter;
import org.sayem.api.httpurlconnection.request.PostRequest;
import org.sayem.api.httpurlconnection.response.PostResponse;
import org.testng.annotations.Test;

import java.io.IOException;

public class AppTest {

    @Test
    public void testSetUp() throws IOException {

        PostRequest request = new PostRequest();
        request.setPassword("passw0rd");
        request.setName("Syed");

        RestAdapter adapter = PostAdapter.builder()
                .setContentType(ContentType.JSON)
                .setRequestObject(request)
                .setEndPoint("http://jsonplaceholder.typicode.com")
                .setMethodName("/posts")
                .build();
        PostResponse response = adapter.execute(PostResponse.class);
        response.getId();

    }
}
