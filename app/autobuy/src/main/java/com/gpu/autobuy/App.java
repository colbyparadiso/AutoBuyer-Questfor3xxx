package com.gpu.autobuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        //TODO: Selected Options, Listen to Controller, Set Config.

        //TODO: Cycle Pings on sites for supply.
        //TODO: TEMP TEST RUN, Single Site ping and email.
        //-----------------------------------------------------------
        


        //-----------------------------------------------------------

        //TODO: If ping, notify.

        //TODO: If options allow, autobuy.



    }
}

/* TODO: CLASS
public class Site {
    public:
        string url;
        //APIObjectPull = Site specific API call;
        //APIObjectPush = Site specific API call;
        //etc.

    private:
        string acc;
        string pass;
        //Necessery API calls for remaining logged in.

    
}
*/