package org.test

import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.ComponentScan

@TestConfiguration
@ComponentScan(
    basePackages = ["org.test"]
)
// works: @EnableConfigurationProperties(ConfigProperties::class)
@ConfigurationPropertiesScan("org.test") // doesn't
class TestContext