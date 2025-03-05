package org.example.design.pattern.templatemethod.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PdfParser extends DocumentParser {
	@Override
	protected void openFile(String filePath) {
		log.info("PDF 파일을 엽니다: {}", filePath);
	}

	@Override
	protected void extractContent() {
		log.info("PDF 파일의 내용을 추출합니다.");
	}

	@Override
	protected void parseContent() {
		log.info("PDF 파일의 내용을 파싱합니다.");
	}

	@Override
	protected void closeFile() {
		log.info("PDF 파일을 닫습니다.");
	}
}
