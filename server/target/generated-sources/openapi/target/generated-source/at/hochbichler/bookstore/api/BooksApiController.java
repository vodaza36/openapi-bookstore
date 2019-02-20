package at.hochbichler.bookstore.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-20T16:17:52.413+01:00[Europe/Berlin]")

@Controller
@RequestMapping("${openapi.server-openapi.base-path:/v1}")
public class BooksApiController implements BooksApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BooksApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
