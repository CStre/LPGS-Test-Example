package lpgs;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class LPGSTest 
{
    

        private LPGS lpgs;
        public ArrayList<String> answers;

        @BeforeEach
        public void beforeEach()
        {
                lpgs = new LPGS();
                answers = new ArrayList<>();
        }

        @Test
        public void testNoEnd()
        {
                final String TEST_INPUT = "GOYE";
                final String TEST_OUTPUT = "GOODBYE";
                answers = this.lpgs.solve(TEST_INPUT);
                assertTrue(answers.contains(TEST_OUTPUT));
                this.lpgs.setNoEnd(true);
                answers = this.lpgs.solve(TEST_INPUT);
                assertFalse(answers.contains(TEST_OUTPUT));
        }

        @Test
        public void testMinLength()
        {
                assertNull(lpgs.solve("GO"));
        }

}