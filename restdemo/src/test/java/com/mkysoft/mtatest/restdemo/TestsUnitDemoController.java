package com.mkysoft.mtatest.restdemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.mkysoft.mtatest.restdemo.web.DemoController;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = DemoController.class)
@ContextConfiguration(classes = DemoController.class)
public class TestsUnitDemoController {

  @Autowired
  private MockMvc restTemplate;

  @Test
  public void testTest() throws Exception {
    MvcResult result = this.restTemplate.perform(get("/test")).andReturn();
    String content = result.getResponse().getContentAsString();
    assertThat(content).startsWith("hello");
  }
}