package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.micronaut.views.View;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Secured(SecurityRule.IS_ANONYMOUS)
@Controller("/login")
public class LoginAuthController {

    @Get("/auth")
    @View("auth")
    public Map<String, Object> auth() {
        return new HashMap<>();
    }

    @Get("/authFailed")
    @View("auth")
    public Map<String, Object> authFailed() {
        return Collections.singletonMap("errors", true);
    }
}
