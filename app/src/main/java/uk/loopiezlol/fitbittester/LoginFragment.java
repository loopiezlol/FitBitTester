package uk.loopiezlol.fitbittester;

import android.app.Fragment;
import android.content.ComponentName;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.support.v4.content.ContextCompat;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class LoginFragment extends Fragment {

    SharedPreferences sharedPreferences;
    Boolean haveToken;

    public static final String CUSTOM_TAB_PACKAGE_NAME = "com.android.chrome";

    private CustomTabsClient mClient;
    private CustomTabsSession mCustomTabsSession;
    private CustomTabsServiceConnection mCustomTabsServiceConnection;
    private CustomTabsIntent customTabsIntent;

    private Button logInButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        logInButton = (Button) view.findViewById(R.id.button);

        return view;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(getActivity());


        speedUpChromeTabs();

        CustomTabsClient.bindCustomTabsService(getActivity(), CUSTOM_TAB_PACKAGE_NAME, mCustomTabsServiceConnection);

        customTabsIntent = new CustomTabsIntent.Builder(mCustomTabsSession)
                .setToolbarColor(ContextCompat.getColor(getActivity(), R.color.primary))
                .setShowTitle(true)
                .build();

        haveToken = sharedPreferences.getBoolean(QuickPreferences.HAVE_AUTHORIZATION,false);

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!haveToken) {
                    String url = "https://www.fitbit.com/oauth2/authorize?" +
                            "response_type=token" +
                            "&client_id=22B3JD" +
                            "&expires_in=2592000" +
                            "&scope=activity%20nutrition%20heartrate%20location%20nutrition%20profile%20settings%20sleep%20social%20weight" +
                            "&redirect_uri=fitbittester://logincallback" +
                            "&prompt=login";
                    customTabsIntent.launchUrl(getActivity(), Uri.parse(url));
                } else {
                    Toast.makeText(getActivity(),
                            "Already logged in. Please go Back",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    private void speedUpChromeTabs() {
        mCustomTabsServiceConnection = new CustomTabsServiceConnection() {
            @Override
            public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                //Pre-warming
                mClient = customTabsClient;
                mClient.warmup(0L);
                mCustomTabsSession = mClient.newSession(null);
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                mClient = null;
            }
        };
    }

    @Override
    public void onResume() {
        super.onResume();

        if (!haveToken) {
            getView().setFocusableInTouchMode(true);
            getView().requestFocus();
            getView().setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {

                    if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                        getFragmentManager().popBackStack();
                        return true;
                    }
                    return false;
                }
            });
        }


    }
}
