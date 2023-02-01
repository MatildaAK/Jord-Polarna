package com.example.grupp1;

import com.example.grupp1.models.Answer;
import com.example.grupp1.models.GameLevel;
import com.example.grupp1.models.Page;
import com.example.grupp1.repository.AnswerRepository;
import com.example.grupp1.repository.LevelRepository;
import com.example.grupp1.repository.PageRepository;
import com.example.grupp1.repository.PlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Grupp1ApplicationTests {

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
