package com.example.jordpolarna;

import com.example.jordpolarna.models.Answer;
import com.example.jordpolarna.models.GameLevel;
import com.example.jordpolarna.repository.AnswerRepository;
import com.example.jordpolarna.repository.LevelRepository;
import com.example.jordpolarna.repository.PageRepository;
import com.example.jordpolarna.repository.PlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JordPolarnaApplicationTests {

	@Autowired
	private PageRepository pageRepository;
	@Autowired
	private LevelRepository levelRepository;
	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private PlayerRepository playerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void findAnswerAltName() {
		Answer test = new Answer(1L, "sandlåda.png", "Sandlåda");
		String result = test.getAlt();
		Assertions.assertEquals("Sandlåda", result);
	}

	@Test
	void findAllGameLevel() {
		List<GameLevel> list = (List)levelRepository.findById(1L).get();

		Assertions.assertEquals("Sandlåda", list);
	}
}
