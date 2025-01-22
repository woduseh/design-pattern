package org.example.design.pattern.chainofresponsibility.src;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Request {
	private final boolean authenticated;
	private final boolean valid;
	private final  String data;
}
