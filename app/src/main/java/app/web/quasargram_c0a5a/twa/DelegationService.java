package app.web.quasargram_c0a5a.twa;


import com.google.androidbrowserhelper.locationdelegation.LocationDelegationExtraCommandHandler;


public class DelegationService extends
        com.google.androidbrowserhelper.trusted.DelegationService {
    @Override
    public void onCreate() {
        super.onCreate();

        
            registerExtraCommandHandler(new LocationDelegationExtraCommandHandler());
        
    }
}

