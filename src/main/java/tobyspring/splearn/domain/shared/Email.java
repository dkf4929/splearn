package tobyspring.splearn.domain.shared;

import java.util.regex.Pattern;

public record Email( String address) {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public Email {
        if (!EMAIL_PATTERN.matcher(address).matches())
            throw new IllegalArgumentException("이메일 형식이 바르지 않습니다: " + address);
    }
}
