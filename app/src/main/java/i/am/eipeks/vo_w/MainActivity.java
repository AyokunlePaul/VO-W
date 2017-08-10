package i.am.eipeks.vo_w;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    private NsdManager.RegistrationListener listener;
    private NsdServiceInfo serviceInfo;
    private NsdManager manager;

    private final int PORT_NUMBER = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = (NsdManager) getSystemService(NSD_SERVICE);

        serviceInfo = new NsdServiceInfo();
        serviceInfo.setServiceName("Eipeks");
        serviceInfo.setServiceType("_http._tcp.");
        serviceInfo.setPort(PORT_NUMBER);

        manager.registerService(serviceInfo, NsdManager.PROTOCOL_DNS_SD, new NsdManager.RegistrationListener() {
            @Override
            public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {

            }

            @Override
            public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {

            }

            @Override
            public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {

            }

            @Override
            public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {

            }
        });

    }

}