package org.example

class Utils implements Serializable {
    def steps
    Utils(steps) { this.steps = steps }

    def hello(String name) {
        steps.echo "Hello from shared lib, ${name}!"
    }
}
