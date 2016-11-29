package linkon.sj;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

public enum LinkonApiEnvironment {

    TEST("http://r.petra2services.linkon.se/"),
    ACCEPTANCE("http://a.petra2services.linkon.se/"),
    PRODUCTION("http://petra2services.linkon.se/");

    @Getter
    private String url;

    LinkonApiEnvironment(String url) {
        this.url = url;
    }

    public static LinkonApiEnvironment getEnvironment(String env) {
        for (LinkonApiEnvironment environment : values()) {
            if (StringUtils.equalsIgnoreCase(environment.name(), env)) {
                return environment;
            }
        }

        return TEST;
    }
}
