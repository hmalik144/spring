package controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.example.demo.PollsSpringApplication;

import net.minidev.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PollsSpringApplication.class)
@AutoConfigureMockMvc
public class PollControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test() throws Exception{
		
		this.mockMvc.perform(get("/questions/"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(jsonPath("$[0].question",is("Which is your favourite State?")))
		.andExpect(jsonPath("$[0].url",is("/questions/1")))
		.andExpect(jsonPath("$[0].pollChoice[0].votes",is(86)))
		.andExpect(jsonPath("$[0].pollChoice[0].choice",is("QLD")))
		.andExpect(jsonPath("$[0].pollChoice[0].url",is("/questions/1/choices/1")));
	}

}
