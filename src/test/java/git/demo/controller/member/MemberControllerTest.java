package git.demo.controller.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MemberControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void joinGetTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/member/join"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void joinPosTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/member/join"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}