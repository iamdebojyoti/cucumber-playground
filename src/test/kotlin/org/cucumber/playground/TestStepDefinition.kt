package org.cucumber.playground

import io.cucumber.java8.En

class TestStepDefinition: En {
    init {
        Given("^I have (\\d+) cukes in my belly$") { cukes: Int ->
            println("No of cukes $cukes")
        }

        When("^I wait (\\d+) hour$") { hour: Int ->
           println("Waiting for $hour")
        }

        Then("^my belly should growl$") {
            println("My stomach is growling")
        }
    }
}