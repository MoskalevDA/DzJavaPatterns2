package ru.netology.patterns;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Info {
    private final String login;
    private final String password;
    private final String status;
}
