package  davenkin

import davlik.Hello

class HelloHere {
    String message = 'hello , I am a new Hello';

    def primessage() {
        Hello hello = new Hello();
        hello.priLog message
    }
    def static prmy(){
        print new HelloHere().message;
    }
}