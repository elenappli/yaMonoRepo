package com.elenappli.serviceA;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;

public class ServiceAControllerTest {
    private final ServiceAController serviceAController = new ServiceAController();
    private MockMvc mvc = MockMvcBuilders.standaloneSetup(serviceAController).build();

    @Test
    public void when_getName_then_serviceNameReturned() throws Exception {
        MockHttpServletResponse response = mvc.perform(
                        MockMvcRequestBuilders.get("/service-a/name")
                                .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("service-a");
    }

    @Test
    public void when_getHelp_then_helpMessageIsReturned() throws Exception {
        MockHttpServletResponse response = mvc.perform(
                        MockMvcRequestBuilders.get("/service-a/help")
                                .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString())
                .isEqualTo("This is serviceA that does nothing");
    }
}
