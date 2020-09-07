package org.test

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.context.annotation.Import

@WebFluxTest
@Import(TestContext::class)
class MyTest(@Autowired val props: ConfigProperties) {

    @Test
    fun doTest(){}
}